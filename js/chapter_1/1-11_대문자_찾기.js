/*
한 개의 문자열을 입력받아 해당 문자열에 알파벳 대문자가 몇 개 있는지 알아내는 프로그램 을 작성하세요.
▣ 입력설명
첫 줄에 문자열이 입력된다. 문자열의 길이는 100을 넘지 않습니다.
▣ 출력설명
첫 줄에 대문자의 개수를 출력한다.
▣ 입력예제 1 
  KoreaTimeGood
▣ 출력예제 1 
  3
*/

function solution(str) {
  const arr = str.split("");
  let count = 0;

  for(let i = 0; i < str.length; i++) {
    if(str[i] === str[i].toUpperCase()) {
      count++;
    }
  }

  return count;

  // for(let str2 of str) {
  //   console.log(str2);
  // }
}

let str="KoreaTimeGood";
console.log(solution(str));