package main;

import java.sql.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        /**
         * 1. Load driver
         * 2. Establish connection
         * 3. Create statement (in SQL or whatever)
         * 4. Execute statement (either directly or grouped by transaction management)
         * 5. Extract results on success
         * 5A. Handle errors
         * 6. Close connection
         */

        Connection connection = null;
        //1 Load driver
        try {
            Class.forName("org.h2.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Could not load driver");
            System.exit(1);
        }
        //2 Establish connection
        try {
            connection = DriverManager.getConnection("jdbc:h2:./delegate_db");
        } catch (SQLException e) {
            System.out.println("Could not connect to database");
            System.exit(1);
        }
        //3 Create statement (not prepared statement - executed straight away)
        try {
            Statement statement = connection.createStatement();
            statement.execute(
                    "create table if not exists delegates (" +
                            "id bigint auto_increment, " +
                            "name varchar(255), " +
                            "email varchar(255), " +
                            "company varchar(255), " +
                            "githubusername varchar(255))"
            );
        } catch (SQLException e) {
            System.out.println("Could not create table");
            System.exit(1);
        }
        // while loop
        Scanner keyboard = new Scanner(System.in);
        while(true){
            System.out.println("Register new delegate (1) or Search delegates (2):");
            int option = keyboard.nextInt();
            keyboard.nextLine();
            if(option ==1){
                System.out.println("Name: ");
                String name = keyboard.nextLine();
                System.out.println("Email: ");
                String email = keyboard.nextLine();
                System.out.println("Company: ");
                String company = keyboard.nextLine();
                System.out.println("GitHub username: ");
                String githubUsername = keyboard.nextLine();

                //4. Execute statement (prepared statement, grouped set of instructions
                // - if any fail, all get rolled back)

                PreparedStatement preparedStatement = null;//SQL placeholders ?,?
                try {
                    preparedStatement = connection.prepareStatement(
                            "insert into delegates (name, email, company, githubusername) values (?, ?, ?, ?)"
                    );
                    // get our Java variable values into the SQL using setString()
                    preparedStatement.setString(1, name);
                    preparedStatement.setString(2, email);
                    preparedStatement.setString(3, company);
                    preparedStatement.setString(4, githubUsername);
                    preparedStatement.execute();
                } catch (SQLException e) {
                    System.out.println("Could not update delegate table");
                    System.exit(1);
                }
            } else if(option == 2){
                System.out.println("Name to search for:");
                String partialName = keyboard.nextLine();
                try {
                    PreparedStatement preparedStatement = connection.prepareStatement(
                            "select * from delegates where name like ?"
                    );
                    preparedStatement.setString(1, "%" + partialName + "%");
                    ResultSet resultSet = preparedStatement.executeQuery();
                    //5 Extract results on success
                    while(resultSet.next()){
                        long id = resultSet.getLong(1);
                        String name = resultSet.getString(2);
                        String email = resultSet.getString(3);
                        String company = resultSet.getString(4);
                        String githubUsername = resultSet.getString(5);
                        System.out.printf("%s, %s, %s, %s, %s\n", id, name, email, company, githubUsername);
                    }
                } catch (SQLException e) {
                    System.out.println("Could not query delegate table");
                    System.exit(1);
                }
            }//end else if
            else{
                System.out.println("Invalid option, please enter a 1 or a 2");
            }//end else
            System.out.println("More? Y/N");
            String more = keyboard.nextLine();
            if(more.equalsIgnoreCase("n")){
                // TODO optional code for wiping database
                break;
            }
            System.out.println("Enter a Y or N");
        }//end while
        try {
            connection.close();
        } catch (SQLException e) {
            System.out.println("Could not close the connection");
            System.exit(1);
        }
    }//end main
}//end class
