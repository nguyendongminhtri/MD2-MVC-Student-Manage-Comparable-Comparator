package com.company.view;

import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);
    StudentView studentView = new StudentView();

    public Main() {
        System.out.println("-----MENU MANAGE STUDENT -----");
        System.out.println("1.Show List Student:\n" +
                "2.Create Student:\n"+
                "3.Delete Student:\n"+
                "4.Detail Student:\n"+
                "5.Edit Student:\n"+
                "6.Sort Student By Age:\n"+
                "6.Sort Student By Name:\n"
        );
        int chooseMenu = scanner.nextInt();
        switch (chooseMenu) {
            case 1:
                studentView.formShowListStudent();
                break;
            case 2:
                studentView.formCreateStudent();
                break;
            case 3:
                studentView.formDeleteStudent();
                break;
            case 4:
                studentView.formDetailStudent();
                break;
            case 5:
                studentView.formEditStudent();
                break;
            case 6:
                studentView.formSortByAge();
                break;
            case 7:
                studentView.formSortByName();
                break;
        }
    }

    public static void main(String[] args) {
        // write your code here
        new Main();
    }
}
