# InfyTQ-Certifications-Exam-Slot-2-Handson-Coding-Question-2of-Day-08-02-2022
Consider a non-empty string instr consisting of only lower-case alphabets. 
Identify and print the string outstr, based on the below logic: 
* Identify all the vowels in instr and add them to outstr in lexicographical order' 
* Considering the first vowel fvowel in outstr. find the index of the first occurrence of fvowel in instr and append it to outstr 
* If there is no vowel in instr add "NA" and append "-1" in place of index 
* Identify all the consonants in instr and append them to outstr in lexicographical order 
* Considering the last consonant Iconsonant in outstr, find the index of the last occurrence of Iconsonant in instr and add it to outstr 
* If there is no consonant in instr add "NA" and append "-1" in place of index. 
Note: Lexicographical order is "abcde....xyz".
INPUT FORMAT: String instr by Standard Input String.
OUTPUT FORMAT: Print outstr to the Standard Output String.

SAMPLE INPUT 1:  temperature

SAMPLE OUTPUT 1:  aeeeu6mprrtt7

EXPLAINATION:-For the given instr-the vowels present in the string are "e", "e", "a"," "u", "e". 
Adding them to outstr based on the lexicographical ordering, outstr becomes "aeeeu". 
The first vowel in outstr, fvowel, is "a" and the index position of the first occurrence "a" in instr,
i.e., "temperature", is 6. Add the index to outstr to get "aeeeu6".
The consonants present in instr are "t", "m", "p", "r", "t", "r". 
Adding them to outstr based on the lexicographical order, outstr becomes "aeeeu6mprrtt". 
The last consonant in outstr, Iconsonant, is "t" and the index position of last occurrence of "t" in instr, 
i.e.,"temperature", is 7.Add the index to outstr to get "aeeeu6mpmtt7"Hence the OUTPUT.

SAMPLE INPUT 2:  rhythm

SAMPLE OUTPUT 2:  NA-1hhmrty2

EXPLAINATION:-For the given instr, there are no vowels. So add "NA" to outstr and append "-1" in place of index to get outstr as "NA-1".
The consonants present in instr are "r", "h", "y", "t", "h", "m". 
Adding them to outstr based on the lexicographical order, outstr becomes "NA-1hhmrty". 
The last consonant in outstr. Iconsonant, is "y" and the index position of last occurrence of mathcal "y" in instr, 
i.e., "rhythm", is 2.Add the index to outstr to get "NA-1hhmrty2".Hence the OUTPUT.
