package LibSys;

import java.sql.*;
import java.util.ArrayList;
import java.util.Random;

public class Func implements Funct {
    Conn conn = new Conn();
    Connection connection = conn.getConnection();
    public void add(String id, String name) {
        try{
            PreparedStatement preparedStatement=connection.prepareStatement("insert into book value(?,?)");
            preparedStatement.setString(1,id);
            preparedStatement.setString(2,name);
            int num = preparedStatement.executeUpdate();
            if(num!=0){
                System.out.println("添加成功");
            }
            else{
                System.out.println("添加失败");
            }
        }
        catch (Exception e)
        {
            System.out.println("添加失败");
        }
    }

    @Override
    public void delete(String id) {
    }

    @Override
    public void update(String id, String name) {
    }

    @Override
    public void select() {
        String sql = "select * from book";
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = null;
            resultSet = statement.executeQuery(sql);
            System.out.printf("图书id"+"              "+"书名");
            System.out.println();
            while (resultSet.next())
            {
                System.out.printf("%-20s",resultSet.getString("id"));
                System.out.printf("%-20s",resultSet.getString("name"));
                System.out.println();
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public void recommend() {
    }
}