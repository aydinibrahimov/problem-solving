����   > �
      java/lang/Object <init> ()V  
RLRRLLRLRL	 
     java/lang/System out Ljava/io/PrintStream;
      +com/aydinibrahimov/leetcode/StringSolutions balancedStringSplit (Ljava/lang/String;)I
      java/io/PrintStream println (I)V
       java/lang/String toCharArray ()[C
 " # $ % & java/util/Arrays stream .([Ljava/lang/Object;)Ljava/util/stream/Stream; ( ) * + , java/util/stream/Stream parallel ()Ljava/util/stream/BaseStream;   . / 0 test  ()Ljava/util/function/Predicate; ( 2 3 4 filter 9(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;  6 7 8 
applyAsInt $()Ljava/util/function/ToIntFunction; ( : ; < mapToInt @(Ljava/util/function/ToIntFunction;)Ljava/util/stream/IntStream; > ? @ A B java/util/stream/IntStream sum ()I D () F o
  H I J replace D(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String; L (al) N al P  
  R S T split '(Ljava/lang/String;)[Ljava/lang/String;
 V W X Y Z java/lang/Math max (II)I
  \ ] B length Code LineNumberTable main ([Ljava/lang/String;)V StackMapTable d [C getTotal ([Ljava/lang/String;)I 	interpret &(Ljava/lang/String;)Ljava/lang/String; mostWordsFound k [Ljava/lang/String; lambda$getTotal$0 (Ljava/lang/String;)Z 
SourceFile StringSolutions.java BootstrapMethods r
 s t u v w "java/lang/invoke/LambdaMetafactory metafactory �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; y (Ljava/lang/Object;)Z {
  | l m m  (Ljava/lang/Object;)I [  InnerClasses � %java/lang/invoke/MethodHandles$Lookup � java/lang/invoke/MethodHandles Lookup !            ^        *� �    _        � ` a  ^   .     L� 	+� � �    _         
   	    ^   �     <<=*� N-�66� &-46L� 	�� ��� ������    _   & 	        $  *  -  1  4  :  b    �    c  � � �  � e f  ^   R     &*� !� ' � (� -  � 1 � 5  � 9 � = �    _            !  "   # %  	 g h  ^   4     *CE� GK*KM� GK*�    _       * 	 +  , 	 i f  ^   v     /<*M,�>6�  ,2:O� Q�6� U<�����    _       1  2  3   4 ' 2 - 6 b    � 
  j j  � "
 l m  ^   1     *� [� � �    _       ! b    @  n    o p     q  x z } q  ~ � � �   
  � � � 