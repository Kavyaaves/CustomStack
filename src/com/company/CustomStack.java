package com.company;
import java.util.Scanner;

public class CustomStack {

    private int arr[];
    private int maxCapacity;
    private int top;

    CustomStack(int size){
        maxCapacity  = size;
        arr = new int[size];
        top=-1;
    }

    private void push(int elem){
        if(top+1 == maxCapacity){
            System.out.println("Stack overflow");
        }else{
            arr[top+1] = elem;
            top+=1;
        }
    }

    private void pop(){
        if(top == -1){
            System.out.println("Stack underflow");
        }else{
            System.out.println("Popped element: " + arr[top]);
            top-=1;
            System.out.print("After popping: ");
            this.display();
        }

    }

    void display(){
        for(int i=0;i<top+1;i++){
            System.out.print(arr[i]+"\t");
        }
    }

    int getTopElement(){
        return arr[top];
    }

    public static void loopPush(CustomStack stack,Scanner sc){
        stack.push(57);
        stack.push(12);
        stack.push(150);
        System.out.print("Stack status: ");
        stack.display();
        init(sc);
    }

    public static void init(Scanner sc){
        System.out.print("Enter the total capacity of the stack: ");
        int size = sc.nextInt();
        CustomStack stack = new CustomStack(size);
        stack.pop();
        stack.push(57);
        stack.push(12);
        stack.push(150);
        int elem = stack.getTopElement();
        System.out.println("Top element of the stack: "+elem);
        stack.display();
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        init(sc);
    }
}
