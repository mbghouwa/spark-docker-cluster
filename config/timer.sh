beg=`date +%s`
./start-app.sh
end=`date +%s`

echo "total time : $((end-beg))"
