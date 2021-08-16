/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomm;

/**
 *
 * @author KEL
 */


import java.util.Random;

public class Randomm {

  

public static void main(String[] args) {
int[] a = { 3, 8, 7, 14, 0, 6, 19, 3, 2, 10 };
Remove(a);
}

static void Remove(int[] a) {
Random r = new Random();

while (a.length > 0) {
int index = r.nextInt(a.length);
System.out.println("At index = " + index + ", Element = " + a[index] + " is removed");

int[] a1 = new int[a.length - 1];
//rearranging the elements
for (int i = 0; i < index; i++)
a1[i] = a[i];

for (int i = index; i < a.length - 1; i++)
a1[i] = a[i + 1];
a = a1;
}
}

    
}
