const fs = require('fs');

fs.readdir('./', function(err, items) {
    if(err)
    return console.error(err);
    //console.log(items); prints in array format

    for (var i=0; i<items.length; i++) {
        console.log(items[i]);
    }
}); 