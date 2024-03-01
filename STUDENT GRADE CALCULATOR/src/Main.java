import javax.swing.*;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int count = 0;
        int sum_tot = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();

        int sub_num = Integer.parseInt(JOptionPane.showInputDialog("How many subjects are you adding ?"));

        while (count < sub_num) {
            int subject_percent = Integer.parseInt(JOptionPane.showInputDialog("Enter mark for subject:"));
            list.add(subject_percent);
            count ++;
        }

        for (int sub_per : list) {
            sum_tot = sum_tot + sub_per;
        }

        int average_per = sum_tot / sub_num;

        if (0 <= average_per && average_per <= 29) {
            JOptionPane.showMessageDialog(null,"Here is a list of your total marks: "+ list +
                    "\nThis is your average percentage: "+ average_per + "%"+
                    "\nYour grade is: 1 (F)");
        }
        else if (30 <= average_per && average_per <= 39) {
            JOptionPane.showMessageDialog(null,"Here is a list of your total marks: "+ list +
                    "\nThis is your average percentage: "+ average_per + "%"+
                    "\nYour grade is: 2 (E)");
        }
        else if (40 <= average_per && average_per <= 49) {
            JOptionPane.showMessageDialog(null,"Here is a list of your total marks: "+ list +
                    "\nThis is your average percentage: "+ average_per + "%"+
                    "\nYour grade is: 3 (D)");
        }
        else if (50 <= average_per && average_per <= 59) {
            JOptionPane.showMessageDialog(null,"Here is a list of your total marks: "+ list +
                    "\nThis is your average percentage: "+ average_per + "%"+
                    "\nYour grade is: 4 (C)");
        }
        else if (60 <= average_per && average_per <= 69) {
            JOptionPane.showMessageDialog(null,"Here is a list of your total marks: "+ list +
                    "\nThis is your average percentage: "+ average_per + "%"+
                    "\nYour grade is: 5 (B)");
        }
        else if (70 <= average_per && average_per <= 79) {
            JOptionPane.showMessageDialog(null,"Here is a list of your total marks: "+ list +
                    "\nThis is your average percentage: "+ average_per + "%"+
                    "\nYour grade is: 6 (A-)");
        }
        else if (80 <= average_per && average_per <= 100) {
            JOptionPane.showMessageDialog(null,"Here is a list of your total marks: "+ list +
                    "\nThis is your average percentage: "+ average_per + "%"+
                    "\nYour grade is: 7 (A+)");
        }
        else {
            System.out.println("Invalid grade");
        }

    }
}