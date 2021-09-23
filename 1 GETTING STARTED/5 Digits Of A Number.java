import java.util.*;
                                public class Main {
                                    public static void main(String[] args) {
                                        Scanner scn = new Scanner(System.in);
                                        int n = scn.nextInt();
                                
                                        int nod = 0;
                                        int temp = n;
                                        while (temp != 10) {
                                            temp /= 10;
                                            nod++;
                                        }
                                
                                        int div = (int) Math.pow(10, nod - 1);
                                        while (div != 0) {
                                            int digit = temp / div;
                                            System.out.println(digit);
                                
                                            temp = temp % div;
                                            div = div / 10;
                                        }
                                    }
                                }
