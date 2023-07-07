package library;

import java.util.List;
import java.util.Scanner;

import library.dao.UserDao;
import library.model.User;
import library.service.user.UserService;
import library.service.user.UserServiceImpl;

public class Main {
  static UserDao userDao = new UserDao();
  static UserService userService = new UserServiceImpl(userDao);

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    try {
      String opsi;
      do {
        User user;
        System.out.println("===== MENU SISTEM =====");
        System.out.print("Input menu: ");
        String menu = in.nextLine();

        switch (menu) {
          case "1":
            System.out.println("INPUT USER");
            user = new User();
            System.out.print("Input email: ");
            user.setEmail(in.nextLine());
            System.out.print("Input full name: ");
            user.setFullname(in.nextLine());
            System.out.print("Input password: ");
            user.setPassword(in.nextLine());
            userService.createUser(user);
            System.out.println();
            break;

          case "2":
            System.out.println("TAMPILKAN USER");
            List<User> users = userService.getUsers();
            for (int i = 0; i < users.size(); i++) {
              System.out.print((i + 1) + ". ");
              User u = users.get(i);
              u.getInfo();
            }
            System.out.println();
            break;

          case "3":
            System.out.println("PERBARUI DATA USER");
            System.out.println("TAMPILKAN USER");
            List<User> users2 = userService.getUsers();
            for (int i = 0; i < users2.size(); i++) {
              System.out.print((i + 1) + ". ");
              User u = users2.get(i);
              u.getInfo();
            }
            System.out.println();

            System.out.println("INPUT USER");
            user = new User();
            System.out.print("Input id user: ");
            int id = Integer.valueOf(in.nextLine());
            System.out.print("Input email: ");
            user.setEmail(in.nextLine());
            System.out.print("Input full name: ");
            user.setFullname(in.nextLine());
            System.out.print("Input password: ");
            user.setPassword(in.nextLine());

            // service
            userService.updateUser(id, user);
            System.out.println();
            break;

          default:
            break;
        }

        System.out.print("\nApakah mau keluar sistem? (y|n): ");
        opsi = in.nextLine();
        System.out.println();
      } while (opsi.equalsIgnoreCase("n"));

    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      in.close();
    }
  }
}
