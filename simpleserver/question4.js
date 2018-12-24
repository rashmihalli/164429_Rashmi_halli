fs = require('fs');
fs.writeFile('helloworld.txt', 'This is Question 4', function (err) {
    if (err) 
        return console.log(err);
    console.log('Wrote Hello World in file helloworld.txt');
});

/*const fs = require('fs');

let writeStream = fs.createWriteStream('secret.txt');

// write some data with a base64 encoding
writeStream.write('hello');

// the finish event is emitted when all data has been flushed from the stream
writeStream.on('finish', () => {  
    console.log('wrote all data to file');
});

// close the stream
writeStream.end(); */