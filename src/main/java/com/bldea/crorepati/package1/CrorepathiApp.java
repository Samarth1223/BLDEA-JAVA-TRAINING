package com.bldea.crorepati.package1;

import java.util.Scanner;

public class CrorepathiApp {

	public static void main(String[] args) throws Exception {
		System.out.println("Welcome to Crorepathi Game");
		System.out.println("Let's welcome our first candidate");
		Scanner sc = new Scanner(System.in);
		Question q = new Question();
		
		System.out.println("What is your name?");
		String name = sc.nextLine();
		System.out.println("What is your age?");
		int age = sc.nextInt();
		System.out.println("What is your city?");
		String city = sc.next();
		System.out.println("What is your state?");
		String state = sc.next();
		
		Candidate c1 = new Candidate(name, age, city, state);
		
		System.out.println("Congratulations for making it till here Mr/Ms. "+c1.getName());
		
		System.out.println("Rules of the game");
		System.out.println("1. There will be 10 questions which rewards a specific amount in" 
				+"incremental order");
		System.out.println("2. The game will contain 3 lifelines.(audience phone, 50-50 and skip the question)");
		System.out.println("3. You can quit game at any stage");
		
		System.out.println("Please type 1 if you wish to see the reward per question."
				+"Else type any key");
		int type_1 = sc.nextInt();
		if(type_1==1) {
			System.out.println("Question-1 : 1000 \n"+
							   "Question-2 : 2000 \n"+
							   "Question-3 : 5000 \n"+
							   "Question-4 : 20000 \n"+
							   "Question-5 : 80000 \n"+
							   "Question-6 : 100000 \n"+
							   "Question-7 : 500000 \n"+
							   "Question-8 : 2000000 \n"+
							   "Question-9 : 5000000 \n"+
							   "Question-10 :10000000 \n");
			System.out.println("Do you wish to continue?? (type: YES/NO)");
			
		}
		else {
			System.out.println("Do you wish to continue?? (type: YES/NO)");
		}
			String type_2 = sc.next();
			if(type_2.equalsIgnoreCase("yes") == true) {
				System.out.println("Let's Begin the game");
				System.out.println("Here is the first que.");
				boolean res1 = Question.fetchQuestion1(c1.getName());
				if(res1==true) {
					System.out.println("Congratulations!! Your Answer is Correct.\n"
							+"You have won RS."+c1.getAmount());
					System.out.println("----------------------------------------------------------------");
					System.out.println("Here is your Next Question");
					boolean res2 = Question.fetchQuestion2(c1.getName());
					if(res2==true) {
						System.out.println("Congratulations!! Your Answer is Correct.\n"
								+"You have won RS."+c1.getAmount());
						System.out.println("----------------------------------------------------------------");
						System.out.println("Here is your Next Question");
						boolean res3 = Question.fetchQuestion3(c1.getName());
						if(res3==true) {
							System.out.println("Congratulations!! Your Answer is Correct.\n"
									+"You have won RS."+c1.getAmount());
							System.out.println("----------------------------------------------------------------");
							System.out.println("Here is your Next Question");
							boolean res4 = Question.fetchQuestion4(c1.getName());
							if(res4==true) {
								System.out.println("Congratulations!! Your Answer is Correct.\n"
										+"You have won RS."+c1.getAmount());
								System.out.println("----------------------------------------------------------------");
								System.out.println("Here is your Next Question");
								boolean res5 = Question.fetchQuestion5(c1.getName());
								if(res5==true) {
									System.out.println("Congratulations!! Your Answer is Correct.\n"
											+"You have won RS."+c1.getAmount());
									System.out.println("----------------------------------------------------------------");
									System.out.println("Here is your Next Question");
									boolean res6 = Question.fetchQuestion6(c1.getName());
									if(res6==true) {
										System.out.println("Congratulations!! Your Answer is Correct.\n"
												+"You have won RS."+c1.getAmount());
										System.out.println("----------------------------------------------------------------");
										System.out.println("Here is your Next Question");
										boolean res7 = Question.fetchQuestion7(c1.getName());
										if(res7==true) {
											System.out.println("Congratulations!! Your Answer is Correct.\n"
													+"You have won RS."+c1.getAmount());
											System.out.println("----------------------------------------------------------------");
											System.out.println("Here is your Next Question");
											boolean res8 = Question.fetchQuestion8(c1.getName());
											if(res8==true) {
												System.out.println("Congratulations!! Your Answer is Correct.\n"
														+"You have won RS."+c1.getAmount());
												System.out.println("----------------------------------------------------------------");
												System.out.println("Here is your Next Question");
												boolean res9 = Question.fetchQuestion9(c1.getName());
												if(res9==true) {
													System.out.println("Congratulations!! Your Answer is Correct.\n"
															+"You have won RS."+c1.getAmount());
													System.out.println("----------------------------------------------------------------");
													System.out.println("Here is your Next Question");
													boolean res10 = Question.fetchQuestion10(c1.getName());
													if(res10==true) {
														System.out.println("Congratulations!! Your Answer is Correct.\n"
																+"You have won RS."+c1.getAmount());
														System.out.println("Congratulations..!!! you are crorepathi");
														}
													else {
														System.out.println("We are Sorry!! Your Answer is incorrect.\n"
																+"You have won RS."+c1.getAmount());
														
													}
													}
												else {
													System.out.println("We are Sorry!! Your Answer is incorrect.\n"
															+"You have won RS."+c1.getAmount());
													
												}
												}
											else {
												System.out.println("We are Sorry!! Your Answer is incorrect.\n"
														+"You have won RS."+c1.getAmount());
												
											}
											}
										else {
											System.out.println("We are Sorry!! Your Answer is incorrect.\n"
													+"You have won RS."+c1.getAmount());
											
										}
										}
									else {
										System.out.println("We are Sorry!! Your Answer is incorrect.\n"
												+"You have won RS."+c1.getAmount());
										
									}
									}
								else {
									System.out.println("We are Sorry!! Your Answer is incorrect.\n"
											+"You have won RS."+c1.getAmount());
									
								}
								}
							else {
								System.out.println("We are Sorry!! Your Answer is incorrect.\n"
										+"You have won RS."+c1.getAmount());
								
							}
							}
						else {
							System.out.println("We are Sorry!! Your Answer is incorrect.\n"
									+"You have won RS."+c1.getAmount());
							
						}
						
						}
					else {
						System.out.println("We are Sorry!! Your Answer is incorrect.\n"
								+"You have won RS."+c1.getAmount());
						
					}
					}
				else {
					System.out.println("We are Sorry!! Your Answer is incorrect.\n"
							+"You have won RS."+c1.getAmount());
					
				}
			}

			else {
				System.out.println("Thank you for coming.All the best");
			}
				
		}
		

	}























