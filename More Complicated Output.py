FirstName= "Bob"
LastName = "Newhard"
Name = FirstName + LastName


pay_rate = 25.25

hours_worked = 45

total = pay_rate*hours_worked



mystring ="""
Name: {0}
Pay Rate: {1}
Hours Worked: {2}
Total Pay: {3}
"""

print mystring.format(Name, pay_rate, hours_worked, total)
