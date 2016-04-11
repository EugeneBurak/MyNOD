/**
 * Created by Женя on 15.01.2016.
 */
/* НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import static java.util.Collections.sort;

public class NOD
{
    public static void main(String[] args) throws IOException
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int a = Integer.parseInt(reader.readLine());
            int b = Integer.parseInt(reader.readLine());
            if (a == 1) System.out.println("Наибольший общий делитель (НОД) = " + a);
            else if (b == 1) System.out.println("Наибольший общий делитель (НОД) = " + b);
            else if (a == b) System.out.println("Наибольший общий делитель (НОД) = " + a);
            else if (a % b == 0) System.out.println("Наибольший общий делитель (НОД) = " + b);
            else if (b % a == 0) System.out.println("Наибольший общий делитель (НОД) = " + a);
            else
            {
                ArrayList<Integer> list1 = new ArrayList<Integer>();
                int x = a;
                int n = 2;
                while (x != 1)
                {
                    if (x % n == 0)
                    {
                        list1.add(n);
                        x = x / n;
                    } else
                    {
                        n = n + 1;
                    }
                }
                ArrayList<Integer> list2 = new ArrayList<Integer>();
                int y = b;
                int m = 2;
                while (y != 1)
                {
                    if (y % m == 0)
                    {
                        list2.add(m);
                        y = y / m;
                    } else
                    {
                        m = m + 1;
                    }
                }
                ArrayList<Integer> list3 = new ArrayList<Integer>();
                for (int n1 = 0; n1 < list1.size(); n1++)
                {
                    for (int m1 = 0; m1 < list2.size(); m1++)
                    {
                        if (list1.get(n1) == list2.get(m1))
                        {
                            list3.add(list1.get(n1));
                        }
                    }
                }
                if (list3.size() == 0)
                    System.out.println("Наибольший общий делитель (НОД) = " + 1);
                else
                {
                    sort(list3);
                    System.out.print("Наибольший общий делитель (НОД) = ");
                    System.out.println(list3.get(list3.size() - 1));
                }
            }
        }
    }

