package database;

import java.util.Scanner;

public class viewfriendlist 
{
private void viewFriendlist(int index)
	{
		String[] Friends = null;
		boolean flag = false;
		Friends = Userlist[index].getFriendList();
		System.out.print("\n----------------------------------------------------------------\n");
		System.out.print(Userlist[index].getUserFname());
		System.out.print(" ");
		System.out.print(Userlist[index].getUserLname());
		System.out.print(" - Friend List\n\n");
		for (int i = 0; i < 10; i++)
		{
			for (int j = 0; j < Userlist[0].getTotalUsers(); j++)
			{
				if (strcmp(Friends[i], Userlist[j].GetId()) == 0)
				{
					System.out.print(Friends[i]);
					System.out.print(" - ");
					System.out.print(Userlist[j].getUserFname());
					System.out.print(" ");
					System.out.print(Userlist[j].getUserLname());
					System.out.print('\n');
					break;
				}
			}
		}
		System.out.print("\n----------------------------------------------------------------\n");
	}
]
