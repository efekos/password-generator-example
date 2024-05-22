# Password Generator Example

This app simply generates 150 random passwords, ranging from 44 characters to 156 characters.

## Explanation

Each password is made of 5 segments seperated with dots (.). Each segment can contain lower-case and upper-case
alphabetical characters, numbers and special characters/symbols. Segments can have different amounts of lengths based
on RNG. Length of each segment is always dividable by 8. More segments are near to 3rd segment, longer they can be.
First and last segments have a length between 8 and 24. 2nd and 4th segments have a length between 8 and 32. Finally,
3rd segment has a length between 8 and 40. This creates 720 different combinations of segment lengths, making each
password more unique.

## Code Explanation

Once you run `Main#main`, it calls `Main#generate` 150 times and prints the results. In `Main#generate`, a StringBuilder
and a Random is used to generate passwords. This method calls `Main#appendSegment` five times, with differently
randomized lengths. It appends a "." between each segment. After that, the final password is returned. In
`Main#appendSegment`, a random character from `Main#characters` gets appended to the given string builder, amount of
times that length is.