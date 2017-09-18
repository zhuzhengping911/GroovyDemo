package zzp.main;

import zzp.pojo.ToDo;

import java.util.Scanner;

/**
 * Created by zhuzhengping
 * on 2017/9/18.
 */
public class ToDoMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (i++ > 0){
            System.out.println(i + "in put item u want to save");
            ToDo toDo = new ToDo();
            toDo.setToDoName(scanner.nextLine());
            System.out.println(toDo + " need to do");
        }
    }
}
