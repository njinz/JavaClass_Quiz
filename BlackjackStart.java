package com.human.ex;
import java.util.*;
public class BlackjackStart {

	public static void main(String[] args) {
		//1.카드생성.식별자(index)이용
		String cardShape[]= {"스페이드","클로버","다이아","하트"};
		String cardNumber[]= {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		int deck[]=new int[52]; 
		for(int i=0;i<52;i++) {
			deck[i]=i;	
		}
		//3.카드를 섞는다.
		Random rd=new Random();
		for(int i=0;i<10000;i++) {
		int rNumber=rd.nextInt(52);
		int temp;
		temp=deck[0];
		deck[0]=deck[rNumber];      //임의로 뽑아 나온 수를 [0]과 바꾼다.
		deck[rNumber]=temp;
		}						
		
		//4.카드를 한장씩 뽑아서 플레이어에게 각각 준다.
		int deckIndex=0;
		int userAdeck[]= {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,};
		int userBdeck[]= {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,}; //why-1? :실제카드와 겹치므로 아예 범위를 벗어난 수 지정.
		int userAindex=0;								//-1: 카드 안받았다는 의미
		int userBindex=0;
		
		boolean userAFlag=true; //카드를 받았는지 여부 확인하기 위해.
		boolean userBFlag=true; 
		Scanner sc=new Scanner(System.in);
		int scoreASum=0;
		int scoreBSum=0;
		
		for(int j=0;j<10;j++) {
			if(userAFlag) {
				System.out.println("Auser님카드를 받으시겠습니까? 0:no 1:yes");
				if(sc.nextLine().equals("0")){
					userAFlag=false; //안받았으니  Flag 는 false
				}
			}
			if(userBFlag) {
				System.out.println("Buser님카드를 받으시겠습니까? 0:no 1:yes");
				if(sc.nextLine().equals("0")){
					userBFlag=false;
				}
			}
			if(!(userAFlag||userBFlag)){
				break; //둘다 안받으면 바로 승부결정해야하므로  for문 빠져나감.
			}	//!or=and가 된다 
			
			
			if(userAFlag) {
			userAdeck[userAindex]=deck[deckIndex];//의미:deck에 있는 deckIndex(첫번째 카드)를 a에게 준다.3장 줄것이라 설정.
			deckIndex++; //하나 줬으니 인덱스 추가시킨다.
			userAindex++;
			}
			if(userBFlag) {
			userBdeck[userBindex]=deck[deckIndex];
			deckIndex++;
			userBindex++;
			}
		
		//5.userA와 userB가 어떤 카드를 받았는지 출력. 
			System.out.println("userA card:");
			for(int i:userAdeck) {
				if(i!=-1) {
				//System.out.print(i+" ");
				System.out.print("카드모양:"+cardShape[i/cardNumber.length]+"   ");
				// 나누기 13하면 카드모양대로 숫자배분 가능
				System.out.print("카드숫자:"+cardNumber[i%cardNumber.length]+"\n");
				} //for each문으로 
			}
			System.out.println("");
			System.out.println("userB card:");
			for(int i=0;i<userBindex;i++) {
				//System.out.print(userBdeck[i]+" ");
				System.out.print("카드모양:"+cardShape[userBdeck[i]/cardNumber.length]+"   ");
				// 나누기 13하면 카드모양대로 숫자배분 가능
				System.out.print("카드숫자:"+cardNumber[userBdeck[i]%cardNumber.length]+"\n");
				} //for문으로 
			
			
			
			
			
			//6.점수계산
			//userAdeck 점수계산
			scoreASum=0;
			for(int i=0;i<userAindex;i++) {
				int scoreA=0;
				scoreA=userAdeck[i]%13+1;
				if(scoreA>10) {
					scoreA=10; //J Q K는 나머지가 11,12,13이므로 모두 10으로 쳐줘야 한다. 
				}
				scoreASum=scoreASum+scoreA;
			}
			//A 1 OR 11
			for(int i=0;i<userAindex;i++) {
				
				if(userAdeck[i]%13==0) {
					//A,2,3,4,5,6,7,8,9,10.J.Q.K 중 A:[0]이므로 %13==0
					//A가 있으면 아까 1로 설정했으므로 +10을 해서 21를 초과하지 않으면 SscoreAsum에 +10 해주고(A=1or11이므로)
					//22을 초과하면 안더해준다. 
					if(scoreASum+10<=21) {
						scoreASum=scoreASum+10;
					}
				}
				
			}
			
			System.out.println("\ntotaluserA:"+scoreASum);
			if(scoreASum>21) {
				System.out.println("userA가 21을 초과");
				break;
			}
			
			
			//userBdeck 점수계산
			scoreBSum=0;
			for(int i=0;i<userBindex;i++) {
				int scoreB=0;
				scoreB=userBdeck[i]%13+1;
				if(scoreB>10) {
					scoreB=10; //J Q K는 나머지가 11,12,13이므로 모두 10으로 쳐줘야 한다. 
				}
				scoreBSum=scoreBSum+scoreB;
			}
			
			for(int i=0;i<userBindex;i++) {
				
				if(userBdeck[i]%13==0) {
					
					if(scoreBSum+10<=21) {
						scoreBSum=scoreBSum+10;
					}
				}
				
			}
			System.out.println("totaluserB:"+scoreBSum);
			
			if(scoreBSum>21) {
				System.out.println("userB가 21을 초과");
				break;
			}
			
		//5.userA와 userB가 어떤 카드를 받았는지 출력. //게임 끝날때 승패 보고싶어서 위에것 복사.
		System.out.println("userA card:");
		for(int i:userAdeck) {
			if(i!=-1) {
			//System.out.print(i+" ");
			System.out.print("카드모양:"+cardShape[i/cardNumber.length]+"   ");
			// 나누기 13하면 카드모양대로 숫자배분 가능
			System.out.print("카드숫자:"+cardNumber[i%cardNumber.length]+"\n");
			} //for each문으로 
		}
		System.out.println("");
		System.out.println("userB card:");
		for(int i=0;i<userBindex;i++) {
			//System.out.print(userBdeck[i]+" ");
			System.out.print("카드모양:"+cardShape[userBdeck[i]/cardNumber.length]+"   ");
			// 나누기 13하면 카드모양대로 숫자배분 가능
			System.out.print("카드숫자:"+cardNumber[userBdeck[i]%cardNumber.length]+"\n");
			} //for문으로 
		
		} //위쪽 for 문 닫아준다.
		
			//7.승패결정
			//a 승리 b승리 무승부 넣는다
			String playState="계속";
			if(scoreASum>21) {
				playState="B승리";
			}else {
				if(scoreBSum>21) {
					playState="A승리";
				}else {
					if(scoreASum>scoreBSum) {
						playState="A승리";
					}else if(scoreASum==scoreBSum) {
						playState="무승부";
					}else {
						playState="B승리";
					}
				}
			}
			System.out.println(playState);
		
		
		//2 .카드출력	
//		for(int i:deck) {
//			System.out.println(i+" ");
//			System.out.println("카드모양:"+cardShape[i/cardNumber.length]);
//			// 나누기 13하면 카드모양대로 숫자배분 가능
//			System.out.println("카드숫자:"+cardNumber[i%cardNumber.length]);	
//			}
	
	}	
	}

