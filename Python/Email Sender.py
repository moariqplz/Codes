import smtplib
smtpUsername = 'USERNAME' #Username of the User
smtpPassword = 'PASSWORD' #Password of the user

sendEmailName ='mfedasiuk@uat.edu' #Who you send the email too
fromUserName = smtpUsername #Your username
 
subjectText = 'Hello Text'
headerText = 'To:' + sendEmailName + '\n' + 'From: ' + fromUserName + '\n' + 'Subject: ' + subjectText
bodyText = 'Hello Word Written by Shelby King '
print headerText + '\n' + bodyText

s = smtplib.SMTP('smtp.gmail.com', 587)

s.ehlo() #Functions from smtplib 
s.starttls()
s.ehlo()

s.login(smtpUser, smtpPass) #Login  FUnction
s.sendmail (fromAdd, toAdd, header + '\n\n' + body)#Sending mail
s.quit() #stopping it