let output=document.getElementById("output");

function display(num){
    output.value+=num;
}

function calculate(){
    try{
        output.value=eval(output.value);
    }
    catch(err){
        alert('Invalid Input');
    }
}

function cl(){
    document.getElementById("output").value='';
}

function del(){
    output.value=output.value.slice(0,-1);
}

