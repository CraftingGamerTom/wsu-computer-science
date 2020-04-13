s1="Welcome Class"
s2="Let\’s start writing Shell Scripts"
num1=`echo $s1 | wc -w`
num2=`echo $s2 | wc -w`
echo "Total words are" `expr $num1 + $num2`
exit 0
