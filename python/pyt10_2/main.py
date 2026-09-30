#ELIF (Else...If) Statement to find out the Letter Grade of a student from a score

score = 82

if score >= 90:
    letter = 'A'
elif score >= 80:
    letter = 'B'
elif score >= 70:
    letter = 'C'
elif score >= 60:
    letter = 'D'
else:
    letter = 'F'
print(letter)