#/bin/bash
xmllint -valid -noout rss.xml
if [ -z "$echo"  ]; then
    echo  "Alles OK"
    else echo ""
    exit 1
fi