#Shell Script to find sum of numbers entered at command-line

clear
sum=0
for i in $*
do
	sum=`expr $sum + $i`
done
echo "Sum is $sum"
            
exit 0