# Palindrome


A palindrome is a word, phrase, number or sequence of words that reads the same backward as forward. Punctuation and spaces between the words or lettering is allowed.


###### Program
```java
class Palindrome
{
    public static void main(String args[])
    {
        String name = "malayalam";
        String reverse = reverse(name);
        if(name.equals(reverse))
        {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome !");
        }
        
    }

    protected static String reverse(String revname)
    {
        int len = revname.length();
        String reverse = "";
        for(int i = len - 1; i >= 0; i--)
        {
            reverse += revname.charAt(i);
        }
        return reverse;
    }
}
```
#### Compile java program

javac ClassName.java


#### Run java Program

java ClassName


### Response

>compile java program : javac Palindrome.java

>run java program : java Palindrome

```java
Palindrome
```



