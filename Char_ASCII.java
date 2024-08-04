package JavaCodingPrograms;

public class Char_ASCII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=65;i<=90;i++) {
			System.out.print((char)i+" "); // output:  A B C D E F G H I J K L M N O P Q R S T U V W X Y Z 
		}
		
		for(int i=1;i<=125;i++) {
			System.out.print((char)i+" "); /* output :    
			                     ! " # $ % & ' ( ) * + , - . / 0 1 2 3 4 5 6 7 8 9 : ; < = > ? @ A B C D E F G H I J K L M N O P Q R S T U V W X Y Z [ \ ] ^ _ ` a b c d e f g h i j k l m n o p q r s t u v w x y z { | } 
		*/
		}

	}

}
