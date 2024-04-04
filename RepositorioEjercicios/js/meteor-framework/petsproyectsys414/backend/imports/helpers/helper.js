export const convertToBase64 = function(files,callback) {
    var selectedFile = files;
    var fileToLoad = selectedFile;
    var fileReader = new FileReader();
    var base64;
    fileReader.onload = function(fileLoadedEvent) {
        base64 = fileLoadedEvent.target.result;
        //console.log("/////////////////////////////////////");
        //console.log(base64);
        //console.log("/////////////////////////////////////");
        callback(null, base64)
    };
    fileReader.readAsDataURL(fileToLoad);
    console.log(base64);
}
