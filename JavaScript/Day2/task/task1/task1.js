function clr(){
    document.getElementById("pas").value = "";
}
function val(value){
    document.getElementById("pas").value += value;
}
function cal(){
    const result = eval(document.getElementById("pas").value);
    document.getElementById("pas").value = result;
}
function revert(){
    let bc = document.getElementById("pas");
    bc.value = bc.value.slice(0, -1);
}