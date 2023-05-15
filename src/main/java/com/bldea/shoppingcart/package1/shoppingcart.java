package com.bldea.shoppingcart.package1;

import java.util.ArrayList;
import java.util.Scanner;

public class shoppingcart {
		ArrayList<String> PName = new ArrayList<String>();
		ArrayList<String> PCode = new ArrayList<String>();
		ArrayList<Double> Price = new ArrayList<Double>();
		ArrayList<Integer> Quantity = new ArrayList<Integer>();
		ArrayList<Double> Total_Price = new ArrayList<Double>();
		double Totalbill=0.0;
		Scanner ip=new Scanner(System.in);
		static shoppingcart obj=new shoppingcart();
		void start()
		{
			obj.Cdetails();
			System.out.println();
			System.out.println("------Press 1 to Get Categories---------");
			int sc=ip.nextInt();
			if(sc==1)
			{
				obj.meth1();
			}
			else
			{
				System.out.println();
				System.out.println("-----------------------------------------------------------------------------------------");
				System.out.println(" Invalid Input, Choose Correct Option !!!");
				System.out.println("-----------------------------------------------------------------------------------------");
				System.out.println();
				obj.start();
			}
				
		}
		double bill(double Totalbill)
		{
			double dis=0.0;
			if(Totalbill>=1000)
			{
				dis=0.05*Totalbill;
			}
			return dis;
		}
		void Cdetails() {
			System.out.println();
			System.out.println("---------USER REGISTRATION-----------");
			System.out.print(" Enter your Name: ");
			String name=ip.nextLine();
			System.out.print(" Enter your Address: ");
			String add=ip.nextLine();
				System.out.print(" Enter your Contact No: ");
				String Phone = ip.next();
				System.out.println();
				System.out.println();
			System.out.println("----------CUSTOMER DETAILS-----------");
				System.out.println(" Name: "+name);
				System.out.println(" Address: "+add);
				System.out.println(" Phone: "+Phone);
				System.out.println("-------------------------------------");
		}
		void com_method(double total,String PN,String PC,double P,int Q)
		{
			System.out.println(" Press 1 for Continue Shopping");
			System.out.println(" Press 2 for Stop here and get bill");
			System.out.println(" Press 3 for Exit");
			int press=ip.nextInt();
			if(press==1)
			{
				Totalbill=Totalbill+total;
				obj.callall(PN,PC,P,Q,total);
				obj.meth1();
			}
			else if(press==2)
			{
				Totalbill=Totalbill+total;
				obj.callall(PN,PC,P,Q,total);
				obj.meth4();
				
			}
			
			else if(press==3)
			{
				System.out.println();
				obj.meth3(5);
			}
			else
			{
				System.out.println();
				System.out.println("-----------------------------------------------------------------------------------------");
				System.out.println(" Invalid Input, Choose Correct Option !!!");
				System.out.println("-----------------------------------------------------------------------------------------");
				System.out.println();
				obj.com_method(total,PN,PC,P,Q);
			}
		}
		void meth1()
		{
			System.out.println();
			System.out.println(" 1) MOBILES");
			System.out.println(" 2) TELEVISIONS");
			System.out.println(" 3) LAPTOPS");
			System.out.println(" 4) CAMERAS");
			System.out.println(" 5) SMART WATCHES");
			System.out.println(" 6) Exit");
			System.out.println("--------------------------------------------------------------------------------------------");
			System.out.println(" Please Choose your option: ");
			int option=ip.nextInt();
			obj.meth2(option);
		}
		void meth2(int option)
		{
			if(option<=6)
			{
				System.out.println(" Are You Sure to Purchase!If(Yes) Type:1, If(Not) Type:2");
				int yes=ip.nextInt();
				if(yes==1)
				{
					obj.meth3(option);
				}
				else if(yes==2)
				{
					obj.meth1();
				}
				else
				{
					System.out.println();
					System.out.println("-----------------------------------------------------------------------------------------");
					System.out.println(" Invalid Input ,Choose Correct Option either 1 or 2 !");
					System.out.println("-----------------------------------------------------------------------------------------");
					System.out.println();
					obj.meth2(option);
				}
			}
			else
			{
				System.out.println();
				System.out.println("-----------------------------------------------------------------------------------------");
				System.out.println(" Invalid Input, Choose Correct Option !!!");
				System.out.println("-----------------------------------------------------------------------------------------");
				System.out.println();
				obj.meth1();
			}
		}
		void meth3(int option)
		{
			switch(option)
			{
			case 1:
				System.out.println();
				System.out.println("----Here are the Top Branded Mobiles----");
				System.out.println(" 101  Oneplus 10 pro-------------->1P------->RS.72000");
				System.out.println(" 102  Iphone 14 Pro Max----------->1P------->RS.128000");
				System.out.println(" 103  Samsung Galaxy S23 Ultra---->1P------->RS.135000");
				System.out.println(" 104  Vivo V27 Pro---------------->1P------->RS.52000");
				System.out.println("-----------------------------------------------------------------------------------------");
				System.out.println(" Please choose your product code: ");
				int mobcode=ip.nextInt();
				if(mobcode==101)
				{
					obj.Oneplus(option);
				}
				else if(mobcode==102)
				{
					obj.Iphone14(option);
				}
				else if(mobcode==103)
				{
					obj.S23ultra(option);
				}
				else if(mobcode==104)
				{
					obj.Vivo(option);
				}
				else
				{
					System.out.println();
					System.out.println("-----------------------------------------------------------------------------------------");
					System.out.println(" Invalid Input, Choose Correct Option !!!");
					System.out.println("-----------------------------------------------------------------------------------------");
					System.out.println();
					obj.meth3(option);
				}
				break;
			case 2:
				System.out.println();
				System.out.println("----Here are the Top Branded Televisions----");
				System.out.println(" 201  Sony Bravia TV----------->1P------->RS.52000");
				System.out.println(" 202  Samsung Tizen TV--------->1P------->RS.13000");
				System.out.println(" 203  MI Q1 TV----------------->1P------->RS.135000");
				System.out.println(" 204  LG UQ7500 TV------------->1P------->RS.50000");
				System.out.println("-----------------------------------------------------------------------------------------");
				System.out.println(" Please Choose your Product code: ");
				int Tcode=ip.nextInt();
				if(Tcode==201)
				{
					obj.SonyTv(option);
				}
				else if(Tcode==202)
				{
					obj.SamTv(option);
					
				}
				else if(Tcode==203)
				{
					obj.MITv(option);
				}
				else if(Tcode==204)
				{
					obj.LGTv(option);
				}
				else
				{
					System.out.println();
					System.out.println("-----------------------------------------------------------------------------------------");
					System.out.println(" Invalid Input, Choose Correct Option !!!");
					System.out.println("-----------------------------------------------------------------------------------------");
					System.out.println();
					obj.meth3(option);
				}
				break;
			case 3:
				System.out.println();
				System.out.println("----Here are the Top Branded Laptops----");
				System.out.println(" 301  Hp Pavilion Gaming 15------------>1P------->RS.64000");
				System.out.println(" 302  Acer Aspire 5 Gaming Laptop------>1P------->RS.62000");
				System.out.println(" 303  Dell Vostro 3420 Laptop---------->1P------->RS.42000");
				System.out.println(" 304  Apple 2022 MacBook Air Laptop---->1P------->RS.113000");
				System.out.println("-----------------------------------------------------------------------------------------");
				System.out.println(" Please Choose your product code: ");
				int Lapcode=ip.nextInt();
				if(Lapcode==301)
				{
					obj.HpL(option);
				}
				else if(Lapcode==302)
				{
					obj.AcerL(option);
					
				}
				else if(Lapcode==303)
				{
					obj.Dell(option);
				}
				else if(Lapcode==304)
				{
					obj.AppL(option);
				}
				else
				{
					System.out.println();
					System.out.println("-----------------------------------------------------------------------------------------");
					System.out.println(" Invalid Input, Choose Correct Option !!!");
					System.out.println("-----------------------------------------------------------------------------------------");
					System.out.println();
					obj.meth3(option);
				}
				break;
			case 4:
				System.out.println();
				System.out.println("----Here are the Top Branded Cameras----");
				System.out.println(" 401  Canon EOS M6 Mark II Camera--------->1P------->RS.80000");
				System.out.println(" 402  Sony Alpha ILCE-7C Camera----------->1P------->RS.140000");
				System.out.println(" 403  Nikon D780 DSLR Camera-------------->1P------->RS.180000");
				System.out.println(" 404  Panasonic LUMIX G7 Camera----------->1P------->RS.42000");
				System.out.println("-----------------------------------------------------------------------------------------");
				System.out.println(" Please choose your product code: ");
				int Camcode=ip.nextInt();
				if(Camcode==401)
				{
					obj.Canon(option);
				}
				else if(Camcode==402)
				{
					obj.SonyC(option);
					
				}
				else if(Camcode==403)
				{
					obj.Nikon(option);
				}
				else if(Camcode==404)
				{
					obj.Panasonic(option);
				}
				else
				{
					System.out.println();
					System.out.println("-----------------------------------------------------------------------------------------");
					System.out.println(" Invalid Input, Choose Correct Option !!!");
					System.out.println("-----------------------------------------------------------------------------------------");
					System.out.println();
					obj.meth3(option);
				}
				break;
			case 5:
				System.out.println();
				System.out.println("----Here are the Top Branded Smart Wataches----");
				System.out.println(" 501  Fire-Boltt Phoenix Smart Watch--------->1P------->RS.1500");
				System.out.println(" 502  boAt Xtend Smartwatch------------------>1P------->RS.2300");
				System.out.println(" 503  Noise Pulse Go Buzz Smart Watch-------->1P------->RS.1700");
				System.out.println(" 504  Fastrack Reflex Vox Smartwatch--------->1P------->RS.2000");
				System.out.println("---------------------------------------------------------------------------------------");
				System.out.println(" Please choose your product code: ");
				int SwCode=ip.nextInt();
				if(SwCode==501)
				{
					obj.FireB(option);
				}
				else if(SwCode==502)
				{
					obj.BoatSw(option);
					
				}
				else if(SwCode==503)
				{
					obj.NoiseSw(option);
				}
				else if(SwCode==504)
				{
					obj.FastrkSw(option);
				}
				else
				{
					System.out.println();
					System.out.println("-----------------------------------------------------------------------------------------");
					System.out.println(" Invalid Input, Choose Correct Option !!!");
					System.out.println("-----------------------------------------------------------------------------------------");
					System.out.println();
					obj.meth3(option);
				}
				break;
			case 6:
				Totalbill=0.0;
				System.out.println();
				System.out.println(" Successfully Exited");
				System.out.println("---------------------------------------------------------------------------------------------");
				System.out.println();
				System.out.println();
				obj.start();
			}
		}
		void Oneplus(int option)
		{
			System.out.println(" Are you sure !!! , if yes type 1 , if not type 2");
	        System.out.println(" If You Want To See Main List Please Type 3");
			int s=ip.nextInt();
			String PN="Oneplus 10 Pro";
			String PC="101";
			double P=72000;
			if(s==1)
			{
				System.out.println(" Oneplus 10 Pro ===> Select the Quantity?");
				int Q=ip.nextInt();
				double total=Q*72000;
				obj.com_method(total,PN,PC,P,Q);
			}
			else if(s==2)
			{
				obj.meth3(option);
			}
			else if(s==3)
			{
				obj.meth1();
			}
			else
			{
				System.out.println();
				System.out.println("-----------------------------------------------------------------------------------------");
				System.out.println(" You entered value is not there ,  choose correct option !!!");
				System.out.println("-----------------------------------------------------------------------------------------");
				System.out.println();
				obj.Oneplus(option);
			}
		}
		void Iphone14(int option)
		{
			System.out.println(" Are you sure !!! , if yes type 1 , if not type 2");
			System.out.println(" If You Want To See Main List Please Type 3");
			int s=ip.nextInt();
			String PN="Iphone 14 Pro Max";
			String PC="102";
			double P=128000;
			if(s==1)
			{
				System.out.println(" Iphone 14 Pro Max ===> Select the Quantity?");
				int Q=ip.nextInt();
				double total=Q*128000;
				obj.com_method(total,PN,PC,P,Q);
			}
			else if(s==2)
			{
				obj.meth3(option);
			}
			else if(s==3)
			{
				obj.meth1();
			}
			else
			{
				System.out.println();
				System.out.println("-----------------------------------------------------------------------------------------");
				System.out.println(" Invalid Input, Choose Correct Option !!!");
				System.out.println("-----------------------------------------------------------------------------------------");
				System.out.println();
				obj.Iphone14(option);
			}
		}
		void S23ultra(int option)
		{
			System.out.println(" Are you sure !,if yes type 1 , if not type 2");
			System.out.println(" If You Want To See Main List Please Type 3");
			int s=ip.nextInt();
			String PN="Samsung S23 Ultra";
			String PC="103";
			double P=135000;
			if(s==1)
			{
				System.out.println("Samsung S23 Ultra ===> Select the Quantity?");
				int Q=ip.nextInt();
				double total=Q*135000;
				obj.com_method(total,PN,PC,P,Q);
			}
			else if(s==2)
			{
				obj.meth3(option);
			}
			else if(s==3)
			{
				obj.meth1();
			}
			else
			{
				System.out.println();
				System.out.println("-----------------------------------------------------------------------------------------");
				System.out.println(" Invalid Input, Choose Correct Option !!!");
				System.out.println("-----------------------------------------------------------------------------------------");
				System.out.println();
				obj.S23ultra(option);
			}
		}
		void Vivo(int option)
		{
			System.out.println(" Are you sure !!!, if yes type 1, if not type 2");
			System.out.println(" If You Want To See Main List Please Type 3");
			int s=ip.nextInt();
			String PN="Vivo V27 Pro";
			String PC="104";
			double P=52000;
			if(s==1)
			{
				System.out.println(" Vivo V27 Pro ===> Select the Quantity?");
				int Q=ip.nextInt();
				double total=Q*52000;
				obj.com_method(total,PN,PC,P,Q);
			}
			else if(s==2)
			{
				obj.meth3(option);
			}
			else if(s==3)
			{
				obj.meth1();
			}
			else
			{
				System.out.println();
				System.out.println("-----------------------------------------------------------------------------------------");
				System.out.println(" Invalid Input,  Choose Correct Option !!!");
				System.out.println("-----------------------------------------------------------------------------------------");
				System.out.println();
				obj.Vivo(option);
			}
		}
		void SonyTv(int option)
		{
			System.out.println(" Are you sure !!! , if yes type 1 , if not type 2");
			System.out.println(" If You Want To See Main List Please Type 3");
			int s=ip.nextInt();
			String PN="Sony Bravia TV";
			String PC="201";
			double P=52000;
			if(s==1)
			{
				System.out.println(" Sony Bravia TV ===> Select the Quantity?");
				int Q=ip.nextInt();
				double total=Q*52000;
				obj.com_method(total,PN,PC,P,Q);
			}
			else if(s==2)
			{
				obj.meth3(option);
			}
			else if(s==3)
			{
				obj.meth1();
			}
			else
			{
				System.out.println();
				System.out.println("-----------------------------------------------------------------------------------------");
				System.out.println(" Invalid Input,  Choose Correct Option !!!");
				System.out.println("-----------------------------------------------------------------------------------------");
				System.out.println();
				obj.SonyTv(option);
			}
		}
		void SamTv(int option)
		{
			System.out.println(" Are you sure !!!, if yes type 1, if not type 2");
			System.out.println(" If You Want To See Main List Please Type 3");
			int s=ip.nextInt();
			String PN="Samsung Tizen TV";
			String PC="202";
			double P=13000;
			if(s==1)
			{
				System.out.println("Samsung Tizen TV ===> Select the Quantity?");
				int Q=ip.nextInt();
				double total=Q*13000;
				obj.com_method(total,PN,PC,P,Q);
			}
			else if(s==2)
			{
				obj.meth3(option);
			}
			else if(s==3)
			{
				obj.meth1();
			}
			else
			{
				System.out.println();
				System.out.println("-----------------------------------------------------------------------------------------");
				System.out.println(" Invalid Input,  Choose Correct Option !!!");
				System.out.println("-----------------------------------------------------------------------------------------");
				System.out.println();
				obj.SamTv(option);
			}
		}
		void MITv(int option)
		{
			System.out.println(" Are you sure !!!, if yes type 1, if not type 2");
			System.out.println(" If You Want To See Main List Please Type 3");
			int s=ip.nextInt();
			String PN="MI Q1 TV";
			String PC="203";
			double P=135000;
			if(s==1)
			{
				System.out.println(" MI Q1 TV ===> Select the Quantity?");
				int Q=ip.nextInt();
				double total=Q*135000;
				obj.com_method(total,PN,PC,P,Q);
			}
			else if(s==2)
			{
				obj.meth3(option);
			}
			else if(s==3)
			{
				obj.meth1();
			}
			else
			{
				System.out.println();
				System.out.println("-----------------------------------------------------------------------------------------");
				System.out.println("Invalid Input,  Choose Correct Option !!!");
				System.out.println("-----------------------------------------------------------------------------------------");
				System.out.println();
				obj.MITv(option);
			}
		}
		void LGTv(int option)
		{
			System.out.println(" Are you sure !!!, if yes type 1, if not type 2");
			System.out.println(" If You Want To See Main List Please Type 3");
			int s=ip.nextInt();
			String PN="LG UQ7500 TV";
			String PC="204";
			double P=50000;
			if(s==1)
			{
				System.out.println(" LGTv ===> Select the Quantity?");
				int Q=ip.nextInt();
				double total=Q*50000;
				obj.com_method(total,PN,PC,P,Q);
			}
			else if(s==2)
			{
				obj.meth3(option);
			}
			else if(s==3)
			{
				obj.meth1();
			}
			else
			{
				System.out.println();
				System.out.println("-----------------------------------------------------------------------------------------");
				System.out.println(" Invalid Input,  Choose Correct Option !!!");
				System.out.println("-----------------------------------------------------------------------------------------");
				System.out.println();
				obj.LGTv(option);
			}
		}
		void HpL(int option)
		{
			System.out.println(" Are you sure !!!, if yes type 1, if not type 2");
			System.out.println(" If You Want To See Main List Please Type 3");
			int s=ip.nextInt();
			String PN="Hp Pavilion Gaming 15";
			String PC="301";
			double P=64000;
			if(s==1)
			{
				System.out.println(" Hp Pavilion Gaming 15 ===> How many do yo need?");
				int Q=ip.nextInt();
				double total=Q*64000;
				obj.com_method(total,PN,PC,P,Q);
			}
			else if(s==2)
			{
				obj.meth3(option);
			}
			else if(s==3)
			{
				obj.meth1();
			}
			else
			{
				System.out.println();
				System.out.println("-----------------------------------------------------------------------------------------");
				System.out.println(" Invalid Input,  Choose Correct Option !!!");
				System.out.println("-----------------------------------------------------------------------------------------");
				System.out.println();
				obj.HpL(option);
			}
		}
		void AcerL(int option)
		{
			System.out.println(" Are you sure !!!, if yes type 1, if not type 2");
			System.out.println(" If You Want To See Main List Please Type 3");
			int s=ip.nextInt();
			String PN="Acer Aspire 5 Gaming Laptop";
			String PC="302";
			double P=62000;
			if(s==1)
			{
				System.out.println(" Acer Aspire 5 Gaming Laptop ===> How many do yo need?");
				int Q=ip.nextInt();
				double total=Q*62000;
				obj.com_method(total,PN,PC,P,Q);
			}
			else if(s==2)
			{
				obj.meth3(option);
			}
			else if(s==3)
			{
				obj.meth1();
			}
			else
			{
				System.out.println();
				System.out.println("-----------------------------------------------------------------------------------------");
				System.out.println(" Invalid Input,  Choose Correct Option !!!");
				System.out.println("-----------------------------------------------------------------------------------------");
				System.out.println();
				obj.AcerL(option);
			}
		}
		void Dell(int option)
		{
			System.out.println(" Are you sure !!!, if yes type 1, if not type 2");
			System.out.println(" If You Want To See Main List Please Type 3");
			int s=ip.nextInt();
			String PN="Dell Vostro 3420 Laptop";
			String PC="303";
			double P=42000;
			if(s==1)
			{
				System.out.println(" Dell Vostro 3420 Laptop ===> How many do yo need?");
				int Q=ip.nextInt();
				double total=Q*42000;
				obj.com_method(total,PN,PC,P,Q);
			}
			else if(s==2)
			{
				obj.meth3(option);
			}
			else if(s==3)
			{
				obj.meth1();
			}
			else
			{
				System.out.println();
				System.out.println("-----------------------------------------------------------------------------------------");
				System.out.println(" Invalid Input,  Choose Correct Option !!!");
				System.out.println("-----------------------------------------------------------------------------------------");
				System.out.println();
				obj.Dell(option);
			}
		}
		void AppL(int option)
		{
			System.out.println(" Are you sure !!!, if yes type 1, if not type 2");
			System.out.println(" If You Want To See Main List Please Type 3");
			int s=ip.nextInt();
			String PN="Apple 2022 MacBook Air Laptop";
			String PC="304";
			double P=113000;
			if(s==1)
			{
				System.out.println(" Apple 2022 MacBook Air Laptop ===> How many do yo need?");
				int Q=ip.nextInt();
				double total=Q*113000;
				obj.com_method(total,PN,PC,P,Q);
			}
			else if(s==2)
			{
				obj.meth3(option);
			}
			else if(s==3)
			{
				obj.meth1();
			}
			else
			{
				System.out.println();
				System.out.println("-----------------------------------------------------------------------------------------");
				System.out.println(" Invalid Input,  Choose Correct Option !!!");
				System.out.println("-----------------------------------------------------------------------------------------");
				System.out.println();
				obj.AppL(option);
			}
		}
		void Canon(int option)
		{
			System.out.println("Are you sure !!!, if yes type 1, if not type 2");
			System.out.println(" If You Want To See Main List Please Type 3");
			int s=ip.nextInt();
			String PN="Canon EOS M6 Mark II Camera";
			String PC="401";
			double P=80000;
			if(s==1)
			{
				System.out.println(" Canon EOS M6 Mark II Camera ===> Select the Quantity?");
				int Q=ip.nextInt();
				double total=Q*80000;
				obj.com_method(total,PN,PC,P,Q);
			}
			else if(s==2)
			{
				obj.meth3(option);
			}
			else if(s==3)
			{
				obj.meth1();
			}
			else
			{
				System.out.println();
				System.out.println("-----------------------------------------------------------------------------------------");
				System.out.println(" Invalid Input,  Choose Correct Option !!!");
				System.out.println("-----------------------------------------------------------------------------------------");
				System.out.println();
				obj.Canon(option);
			}
		}
		void SonyC(int option)
		{
			System.out.println(" Are you sure !!!, if yes type 1, if not type 2");
			System.out.println(" If You Want To See Main List Please Type 3");
			int s=ip.nextInt();
			String PN="Sony Alpha ILCE-7C Camera";
			String PC="402";
			double P=140000;
			if(s==1)
			{
				System.out.println(" Sony Alpha ILCE-7C Camera ===> Select the Quantity?");
				int Q=ip.nextInt();
				double total=Q*140000;
				obj.com_method(total,PN,PC,P,Q);
			}
			else if(s==2)
			{
				obj.meth3(option);
			}
			else if(s==3)
			{
				obj.meth1();
			}
			else
			{
				System.out.println();
				System.out.println("-----------------------------------------------------------------------------------------");
				System.out.println(" Invalid Input,  Choose Correct Option !!!");
				System.out.println("-----------------------------------------------------------------------------------------");
				System.out.println();
				obj.SonyC(option);
			}
		}
		void Nikon(int option)
		{
			System.out.println(" Are you sure !!!, if yes type 1, if not type 2");
			System.out.println(" If You Want To See Main List Please Type 3");
			int s=ip.nextInt();
			String PN="Nikon D780 DSLR Camera";
			String PC="403";
			double P=180000;
			if(s==1)
			{
				System.out.println(" Nikon D780 DSLR Camera ===> Select the Quantity?");
				int Q=ip.nextInt();
				double total=Q*180000;
				obj.com_method(total,PN,PC,P,Q);
			}
			else if(s==2)
			{
				obj.meth3(option);
			}
			else if(s==3)
			{
				obj.meth1();
			}
			else
			{
				System.out.println();
				System.out.println("-----------------------------------------------------------------------------------------");
				System.out.println(" Invalid Input,  Choose Correct Option !!!");
				System.out.println("-----------------------------------------------------------------------------------------");
				System.out.println();
				obj.Nikon(option);
			}
		}
		void Panasonic(int option)
		{
			System.out.println(" Are you sure !!!, if yes type 1, if not type 2");
			System.out.println(" If You Want To See Main List Please Type 3");
			int s=ip.nextInt();
			String PN="Panasonic LUMIX G7 Camera";
			String PC="404";
			double P=42000;
			if(s==1)
			{
				System.out.println(" Panasonic LUMIX G7 Camera ===> Select the Quantity?");
				int Q=ip.nextInt();
				double total=Q*42000;
				obj.com_method(total,PN,PC,P,Q);
			}
			else if(s==2)
			{
				obj.meth3(option);
			}
			else if(s==3)
			{
				obj.meth1();
			}
			else
			{
				System.out.println();
				System.out.println("-----------------------------------------------------------------------------------------");
				System.out.println(" Invalid Input,  Choose Correct Option !!!");
				System.out.println("-----------------------------------------------------------------------------------------");
				System.out.println();
				obj.Panasonic(option);
			}
		}
		void FireB(int option)
		{
			System.out.println(" Are you sure !!!, if yes type 1, if not type 2");
			System.out.println(" If You Want To See Main List Please Type 3");
			int s=ip.nextInt();
			String PN="Fire-Boltt Phoenix Smart Watch";
			String PC="501";
			double P=1500;
			if(s==1)
			{
				System.out.println(" Fire-Boltt Phoenix Smart Watch ===> Select the Quantity?");
				int Q=ip.nextInt();
				double total=Q*1500;
				obj.com_method(total,PN,PC,P,Q);
			}
			else if(s==2)
			{
				obj.meth3(option);
			}
			else if(s==3)
			{
				obj.meth1();
			}
			else
			{
				System.out.println();
				System.out.println("-----------------------------------------------------------------------------------------");
				System.out.println(" Invalid Input,  Choose Correct Option !!!");
				System.out.println("-----------------------------------------------------------------------------------------");
				System.out.println();
				obj.FireB(option);
			}
		}
		void BoatSw(int option)
		{
			System.out.println(" Are you sure !!!, if yes type 1, if not type 2");
			System.out.println(" If You Want To See Main List Please Type 3");
			int s=ip.nextInt();
			String PN="boAt Xtend Smartwatch";
			String PC="502";
			double P=2300;
			if(s==1)
			{
				System.out.println(" boAt Xtend Smartwatch ===> Select the Quantity?");
				int Q=ip.nextInt();
				double total=Q*2300;
				obj.com_method(total,PN,PC,P,Q);
			}
			else if(s==2)
			{
				obj.meth3(option);
			}
			else if(s==3)
			{
				obj.meth1();
			}
			else
			{
				System.out.println();
				System.out.println("-----------------------------------------------------------------------------------------");
				System.out.println(" Invalid Input,  Choose Correct Option !!!");
				System.out.println("-----------------------------------------------------------------------------------------");
				System.out.println();
				obj.BoatSw(option);
			}
		}
		void NoiseSw(int option)
		{
			System.out.println(" Are you sure !!!, if yes type 1, if not type 2");
			System.out.println(" If You Want To See Main List Please Type 3");
			int s=ip.nextInt();
			String PN="Noise Pulse Go Buzz Smart Watch";
			String PC="503";
			double P=1700;
			if(s==1)
			{
				System.out.println(" Noise Pulse Go Buzz Smart Watch ===> Select the Quantity?");
				int Q=ip.nextInt();
				double total=Q*1700;
				obj.com_method(total,PN,PC,P,Q);
			}
			else if(s==2)
			{
				obj.meth3(option);
			}
			else if(s==3)
			{
				obj.meth1();
			}
			else
			{
				System.out.println();
				System.out.println("-----------------------------------------------------------------------------------------");
				System.out.println(" Invalid Input,  Choose Correct Option !!!");
				System.out.println("-----------------------------------------------------------------------------------------");
				System.out.println();
				obj.NoiseSw(option);
			}
		}
		void FastrkSw(int option)
		{
			System.out.println(" Are you sure !!!, if yes type 1, if not type 2");
			System.out.println(" If You Want To See Main List Please Type 3");
			int s=ip.nextInt();
			String PN="Fastrack Reflex Vox Smartwatch";
			String PC="504";
			double P=2000;
			if(s==1)
			{
				System.out.println(" Fastrack Reflex Vox Smartwatch ===> Select the Quantity?");
				int Q=ip.nextInt();
				double total=Q*2000;
				obj.com_method(total,PN,PC,P,Q);
			}
			else if(s==2)
			{
				obj.meth3(option);
			}
			else if(s==3)
			{
				obj.meth1();
			}
			else
			{
				System.out.println();
				System.out.println("-----------------------------------------------------------------------------------------");
				System.out.println(" Invalid Input,  Choose Correct Option !!!");
				System.out.println("-----------------------------------------------------------------------------------------");
				System.out.println();
				obj.FastrkSw(option);
			}
		}
		
		void meth4()
		{
			System.out.println();
			System.out.println("------------------------------WELCOME TO ELECTRONICS SHOPPING-MART------------------------------------");
			System.out.println("******************************************************************************************************");
			System.out.println();
			System.out.println("------------------------------------------------------------------------------------------------------");
			System.out.println(" S.No	   Product Name    	   Product Code       Quantity	      Price              Total Price");
			System.out.println(" ====	   =============           ============       ========        ======             ===========");
			for(int i=0;i<PName.size();i++)
			{
		    System.out.println("------------------------------------------------------------------------------------------------------");
		    System.out.println("  "+(i+1)+"   	  "+PName.get(i)+"              "+PCode.get(i)+"		 "+Quantity.get(i)+"	     "+Price.get(i)+"    	  "+Total_Price.get(i));
		    System.out.println("------------------------------------------------------------------------------------------------------");
			}
			System.out.println();
			System.out.println(" Total bill of purchased items:  "+Totalbill);
			double discount=obj.bill(Totalbill);
//			if(discount>0.0)
//				System.out.println(" Hey "+name+" congtrats !!! you received a discount of 5%: "+discount);
//			System.out.println(" Sorry "+name+" you are not received any discount...");
			System.out.println(" Your Final Bill is: "+(Totalbill));
			System.out.println();
			System.out.println("---------------------------------Thank you for shopping----------------------------------");
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println();
			System.out.println();
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println("<<<<<-------------------**** IF YOU LIKE TO SHOP AGAIN ****---------------->>>>>>>");
			System.out.println("-----------------------------------------------------------------------------------------");
			obj.meth5();
		}
		void meth5()
		{
			System.out.println("If yes press 1 or else press 2");
			int press=ip.nextInt();
			if(press==1)
				obj.meth1();
			else if(press==2)
			{	
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println("-----------------------------------------------------------------------------------------");
				System.out.println("<<<<<<<<<<,,,,,,,,,,,,,,,,,,,,Once again THANK YOU for Shopping,,,,,,,,,,,,,,,,,>>>>>>>>>");
				System.out.println("-----------------------------------------------------------------------------------------");
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
			}	
			else
			{
				System.out.println();
				System.out.println("-----------------------------------------------------------------------------------------");
				System.out.println(" Invalid Input,  Choose Correct Option !!!");
				System.out.println("-----------------------------------------------------------------------------------------");
				System.out.println();
				obj.meth5();
			}
			ip.close();
		}
		void callall(String PN,String PC,double P,int Q,double total)
		{
			PName.add(PN);
			PCode.add(PC);
			Price.add(P);
			Quantity.add(Q);
			Total_Price.add(total);
		}
	
	public static void main(String[] args){
		System.out.println("!!!-----WELCOME TO ELECTRONICS SHOPPING-MART-----!!!");
		obj.start();

     }
}