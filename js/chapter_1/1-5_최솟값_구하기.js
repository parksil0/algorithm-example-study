/*
7개의 수가 주어지면 그 숫자 중 가장 작은 수를 출력하는 프로그램을 작성하세요.
▣ 입력설명
첫 번째 줄에 7개의 수가 주어진다.
▣ 출력설명
첫 번째 줄에 가장 작은 값을 출력한다.
▣ 입력예제 1
5 3 7 11 2 15 17
▣ 출력예제 1 
2
*/

//1.
function solution(...numbers) {
  numbers.sort((num1, num2) => {
    return num1 - num2;
  });

  return numbers[0];
}

//2.
function solution2(a,b,c,d,e,f,g) {
  let arr = [a,b,c,d,e,f,g];
  let min = 0;
  for(let i = 1; i < arr.length; i++) {
    if(arr[i-1] > arr[i]) min = arr[i];
  }
  return min;
}

console.log(solution2(5, 3, 7, 11, 2, 15, 17));