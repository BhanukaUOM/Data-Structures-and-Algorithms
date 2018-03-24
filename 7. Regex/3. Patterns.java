//Matching Anything except Newline 
 
.      : Matches any single character except newline. Using m option allows it to match the newline as well. 
[...]  : Matches any single character in brackets. Eg [12a,] : match 1 or 2 or a or , 
[^...] : any character except in brackets. Eg [12a,] : match any except 1 or 2 or a or , 
 \\.   : dot 
 
"...\\....\\....\\...." :  ???.???.???.???    
"...[.]...[.]...[.]..." :  ???.???.???.???     
 
 
 
 
//Digits & Non-Digit Characters 
 
\d : Matches the digits. Equivalent to [0-9]. 
\D : Matches the nondigits. 
 
"\\d\\d\\D\\d\\d\\D\\d\\d\\d\\d" : 20-02-2018 
 
 
 
 
//Digits & Non-Digit Characters 
 
\d : Matches the digits. Equivalent to [0-9]. 
\D : Matches the nondigits. 
 
"\\d\\d\\D\\d\\d\\D\\d\\d\\d\\d" : 20-02-2018 
 
 
 
//Whitespace & Non-Whitespace Character 
 
\s : Matches the whitespace. Equivalent to [\t\n\r\f]. 
\S : Matches the nonwhitespace. 
 
"\\S\\S\\S\\s\\S\\S\\S\\s\\S\\S\\S\\s\\S\\S\\S"  :   ??? ??? ??? ??? 
 
 
 
//Word & Non Word Characters 
 
\w         : Matches the word characters. 
 \W        : Matches the nonword characters. 
re{ n}     : Matches exactly n number of occurrences of the preceding expression. 
re{ n,}    : Matches n or more occurrences of the preceding expression. 
re{ n, m}  : Matches at least n and at most m occurrences 
    re*    : 0 or more 
    re+    : 1 or more 
 
 
"\\w\\w\\w\\W\\w\\w\\w\\W\\w\\w\\w" : www.abc.com 
"\\w{3}\\W\\w{10}\\W\\w{3}" 
 
 
 
//Matching Start & End 
 
^ : Matches the beginning of the line. 
$ : Matches the end of the line. 
 
"^\\d\\w{4}\\.$" : 0aaaa. 
 
 
//Excluding Specific Characters & Ranges 
 
^ : negated character class 
 
"[^d][^aeiou][^bcDF][^AEIOU][^.,]" =  thnk? 
[A-Z][0-] 
