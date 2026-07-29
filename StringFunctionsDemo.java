public class StringFunctionsDemo{
public static void main(String[] args){
String str1="Java Programming";
String str2="java programming";
String str3="Welcome to java";
System.out.println("original string:"+str1);
System.out.println("length:"+str1.length());
System.out.println("character at index 5:"+str1.charAt(5));
System.out.println("substring(5):"+str1.substring(5));
System.out.println("substring(5,11):"+str1.substring(5,11));
System.out.println("concatenation:"+str1.concat("language"));
System.out.println("equal:"+str1.equals(str2));
System.out.println("equals ignore case:"+str1.equalsIgnoreCase(str2));
System.out.println("compareto:"+str1.compareTo(str2));
System.out.println("compare to ignore case:"+str1.compareToIgnoreCase(str2));
System.out.println("contains 'Java':"+str1.contains("Java"));
System.out.println("starts with 'Java':"+str1.startsWith("Java"));
System.out.println("ends with 'ming':"+str1.endsWith("ming"));
System.out.println("index of 'P':"+str1.indexOf('P'));
System.out.println("last index of 'a':"+str1.lastIndexOf('a'));
System.out.println("Replace Java with Python: " + str1.replace("Java","Python"));
System.out.println("ReplaceAll vowels: " + str1.replaceAll("[AEIOUaeiou]", "*"));
System.out.println("Upper Case: " + str1.toUpperCase());
System.out.println("Lower Case: " + str1.toLowerCase());
System.out.println("Trim: '" + str3.trim() + "'");
String str4 = "";
System.out.println("Is Empty: " + str4.isEmpty());
String[] words = str1.split(" ");
System.out.println("Split:");
for(String word : words){
    System.out.println(word);
}
int num = 100;
String s = String.valueOf(num);
System.out.println("ValueOf(): " + s);
char[] ch = str1.toCharArray();
System.out.println("Character Array:");
for(char c : ch){
    System.out.println(c + " ");
}
System.out.println();
String joined = String.join("-", "Java","Python","C++");
System.out.println("Join: " + joined);
//System.out.println("Repeat: " + "Hi ".repeat(3));
}
}