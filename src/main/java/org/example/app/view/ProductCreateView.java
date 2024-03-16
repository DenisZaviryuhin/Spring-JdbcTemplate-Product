package org.example.app.view;

import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class ProductCreateView {
    public String[] getData() {
        Scanner scanner = new Scanner(System.in);
        String title = "Input product name: ";
        System.out.print(title);
        String productName = scanner.nextLine().trim();
        title = "Input quota, pcs: ";
        System.out.print(title);
        String qouta = scanner.nextLine().trim();
        title = "Input price in format x.xx: ";
        System.out.print(title);
        String price = scanner.nextLine().trim();
        return new String[]{productName, qouta, price};
    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}
