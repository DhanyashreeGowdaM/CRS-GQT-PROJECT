package Arrays;
import java.util.Scanner;
public class Array5DJagged {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Total Number of University:");
		int n = sc.nextInt();
		
		System.out.println("Enter the Total Number of College in University:");
		int o = sc.nextInt();
		
		System.out.println("Enter the Total Number of Department in each college of each university:");
		int p = sc.nextInt();
		
		int a[] [] [] [] [] = new int[n][o][p][][];

		
		//loop for collecting the college count in each University
				for(int i=0;i<n;i++) {
					for(int j=0;j<o;j++) {
						for(int k=0;k<p;k++) {
					System.out.println("Enter the total number of classes");
					int cls = sc.nextInt();
					System.out.println("Enter the total number of students ");
					int stud = sc.nextInt();
					a[i][j][k]= new int[cls][stud];
			}
					}
				}
				for(int i=0;i<a.length;i++) {
					for(int j=0;j<a[i].length;j++) {
						for(int k=0;k<a[i][j].length;k++) {
							for(int l=0;l<a[i][j][k].length;l++) {
								for(int m=0;m<a[i][j][k][l].length;m++) {
									System.out.println("Enter the marks");
									a[i][j][k][l][m] = sc.nextInt();
								}
								
							}
							
							
						}
					}
				}
				for(int i=0;i<a.length;i++) {
					for(int j=0;j<a[i].length;j++) {
						for(int k=0;k<a[i][j].length;k++) {
							for(int l=0;l<a[i][j][k].length;l++) {
								for(int m=0;m<a[i][j][k][l].length;m++) {
									System.out.println("Enter the marks = "+a[i][j][k][l][m]);
								}
								
							}
							
							
						}
					}
				}
	}
}
/*
 * Enter the Total Number of University:
2
Enter the Total Number of College in University:
4
Enter the Total Number of Department in each college of each university:
2
Enter the total number of classes
3
Enter the total number of students 
3
Enter the total number of classes
2
Enter the total number of students 
3
Enter the total number of classes
3
Enter the total number of students 
3
Enter the total number of classes
2
Enter the total number of students 
3
Enter the total number of classes
3
Enter the total number of students 
3
Enter the total number of classes
2
Enter the total number of students 
3
Enter the total number of classes
3
Enter the total number of students 
3
Enter the total number of classes
2
Enter the total number of students 
3
Enter the total number of classes
3
Enter the total number of students 
3
Enter the total number of classes
2
Enter the total number of students 
3
Enter the total number of classes
3
Enter the total number of students 
3
Enter the total number of classes
2
Enter the total number of students 
3
Enter the total number of classes
3
Enter the total number of students 
3
Enter the total number of classes
2
Enter the total number of students 
3
Enter the total number of classes
3
Enter the total number of students 
3
Enter the total number of classes
2
Enter the total number of students 
3
Enter the marks
80
Enter the marks
70
Enter the marks
80
Enter the marks
90
Enter the marks
80
Enter the marks
89
Enter the marks
89
Enter the marks
7
Enter the marks
67
Enter the marks
87
Enter the marks
88
Enter the marks
79
Enter the marks
80
Enter the marks
76
Enter the marks
67
Enter the marks
65
Enter the marks
78
Enter the marks
87
Enter the marks
78
Enter the marks
78
Enter the marks
98
Enter the marks
76
Enter the marks
54
Enter the marks
45
Enter the marks
34
Enter the marks
78
Enter the marks
54
Enter the marks
86
Enter the marks
86
Enter the marks
86
Enter the marks
56
Enter the marks
87
Enter the marks
89
Enter the marks
54
Enter the marks
78
Enter the marks
86
Enter the marks
65
Enter the marks

56
Enter the marks
56
Enter the marks
86
Enter the marks
98
Enter the marks
98
Enter the marks
76
Enter the marks
56
Enter the marks
97
Enter the marks
58
Enter the marks
47
Enter the marks
96
Enter the marks
37
Enter the marks
56
Enter the marks
78
Enter the marks
76
Enter the marks
65
Enter the marks
79
Enter the marks
54
Enter the marks
68
Enter the marks
76
Enter the marks
69
Enter the marks
56
Enter the marks
84
Enter the marks
83
Enter the marks
35
Enter the marks
58
Enter the marks
48
Enter the marks
48
Enter the marks
37
Enter the marks
37
Enter the marks
57
Enter the marks
57
Enter the marks
57
Enter the marks
57
Enter the marks
576
Enter the marks
86
Enter the marks
65
Enter the marks
46
Enter the marks
967
Enter the marks
78
Enter the marks
56
Enter the marks
46
Enter the marks
43
Enter the marks
65
Enter the marks
78
Enter the marks
87
Enter the marks
78
Enter the marks
76
Enter the marks
89
Enter the marks
98
Enter the marks
78
Enter the marks
87
Enter the marks
76
Enter the marks
67
Enter the marks
67
Enter the marks
76
Enter the marks
56
Enter the marks

65
Enter the marks
78
Enter the marks
87
Enter the marks
78
Enter the marks
87
Enter the marks
7
Enter the marks
8
Enter the marks
67
Enter the marks
76
Enter the marks
79
Enter the marks
78
Enter the marks
8
Enter the marks
98
Enter the marks
87
Enter the marks
76
Enter the marks
67
Enter the marks
76
Enter the marks
68
Enter the marks
76
Enter the marks
6
Enter the marks
67
Enter the marks
76
Enter the marks
67
Enter the marks
76
Enter the marks
67
Enter the marks
67

Enter the marks = 80
Enter the marks = 70
Enter the marks = 80
Enter the marks = 90
Enter the marks = 80
Enter the marks = 89
Enter the marks = 89
Enter the marks = 7
Enter the marks = 67
Enter the marks = 87
Enter the marks = 88
Enter the marks = 79
Enter the marks = 80
Enter the marks = 76
Enter the marks = 67
Enter the marks = 65
Enter the marks = 78
Enter the marks = 87
Enter the marks = 78
Enter the marks = 78
Enter the marks = 98
Enter the marks = 76
Enter the marks = 54
Enter the marks = 45
Enter the marks = 34
Enter the marks = 78
Enter the marks = 54
Enter the marks = 86
Enter the marks = 86
Enter the marks = 86
Enter the marks = 56
Enter the marks = 87
Enter the marks = 89
Enter the marks = 54
Enter the marks = 78
Enter the marks = 86
Enter the marks = 65
Enter the marks = 56
Enter the marks = 56
Enter the marks = 86
Enter the marks = 98
Enter the marks = 98
Enter the marks = 76
Enter the marks = 56
Enter the marks = 97
Enter the marks = 58
Enter the marks = 47
Enter the marks = 96
Enter the marks = 37
Enter the marks = 56
Enter the marks = 78
Enter the marks = 76
Enter the marks = 65
Enter the marks = 79
Enter the marks = 54
Enter the marks = 68
Enter the marks = 76
Enter the marks = 69
Enter the marks = 56
Enter the marks = 84
Enter the marks = 83
Enter the marks = 35
Enter the marks = 58
Enter the marks = 48
Enter the marks = 48
Enter the marks = 37
Enter the marks = 37
Enter the marks = 57
Enter the marks = 57
Enter the marks = 57
Enter the marks = 57
Enter the marks = 576
Enter the marks = 86
Enter the marks = 65
Enter the marks = 46
Enter the marks = 967
Enter the marks = 78
Enter the marks = 56
Enter the marks = 46
Enter the marks = 43
Enter the marks = 65
Enter the marks = 78
Enter the marks = 87
Enter the marks = 78
Enter the marks = 76
Enter the marks = 89
Enter the marks = 98
Enter the marks = 78
Enter the marks = 87
Enter the marks = 76
Enter the marks = 67
Enter the marks = 67
Enter the marks = 76
Enter the marks = 56
Enter the marks = 65
Enter the marks = 78
Enter the marks = 87
Enter the marks = 78
Enter the marks = 87
Enter the marks = 7
Enter the marks = 8
Enter the marks = 67
Enter the marks = 76
Enter the marks = 79
Enter the marks = 78
Enter the marks = 8
Enter the marks = 98
Enter the marks = 87
Enter the marks = 76
Enter the marks = 67
Enter the marks = 76
Enter the marks = 68
Enter the marks = 76
Enter the marks = 6
Enter the marks = 67
Enter the marks = 76
Enter the marks = 67
Enter the marks = 76
Enter the marks = 67
Enter the marks = 67

*/