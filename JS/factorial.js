function factorial(){
    var x= document.getElementById('input').value;
    var num=Number(x);
    
    if (num===0 || num===1){
        document.getElementById('output').innerHTML =  num+ '!'+" is 1";
    }
    let result=1;
    for(let i=2;i<=num;i++){
        result*=i;
    }
    console.log(result);

    document.getElementById('output').innerHTML =  num+ '!'+" is "+result;
    return;
}