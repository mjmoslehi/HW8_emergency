package main;

import menu.Menu;
import model.Cart;
import model.Category;
import model.Product;
import model.User;
import service.cart.CartService;
import service.category.CategoryService;
import service.product.ProductService;
import service.user.UserService;
import utility.ApplicationContext;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {

        Menu menu = new Menu();
        menu.publicMenu();

    }
}
