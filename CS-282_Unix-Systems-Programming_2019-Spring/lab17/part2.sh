#Shell Script to demonstrate switch..case and command line parameters

clear
optX=false

case "$1" in
-drag)
	optX=true
	shift
	;;
-del)
	shift
	;;
*)
	echo "Invalid Argument: $1"  1>&2
	exit 1
	;;
esac

if test $optX = true
then
	for i in $*
	do
		mv $i ./temp
	done
else
	for i in $*
	do
		rm -i $i
	done
fi
            
exit 0