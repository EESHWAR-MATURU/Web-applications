function checkPerfectNumber() {
    let number = document.getElementById('number').value;
    let num_number=Number(number);
    
    if (num_number <= 1) {
        document.getElementById('output').innerHTML = number + ' is not a Perfect Number (must be greater than 1).';
        return;
    }

    let sum = 1; 
    let temp = num_number; 

    for (let i = 2; i <= Math.sqrt(temp); i++) {
        if (temp % i === 0) {
            sum += i;
            if (i !== temp / i) {
                sum += temp / i;
            }
        }
    }
    console.log(typeof(sum));
    console.log(typeof(number));
    console.log(typeof(num_number));
    console.log(typeof(temp));

    if (sum === temp) {
        document.getElementById('output').innerHTML = temp + ' is a Perfect Number.';
    } else {
        document.getElementById('output').innerHTML = temp + ' is not a Perfect Number.';
    }
}