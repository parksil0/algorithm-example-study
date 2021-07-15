/*
한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출 력하는 프로그램을 작성하세요.
▣ 입력설명
첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어집니다. 문자열의 길이는 100을 넘지 않는다.
▣ 출력설명
첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다.
▣ 입력예제 1 
  teachermode e
▣ 출력예제 1 
  10121012210
*/

/*
  시간복잡도가 O(n^2)라서 탈락.
  해답은 O(n)임.

function solution(str, keyword) {
  let keywordLocatedArray = [];
  let index = str.indexOf(keyword);
  while (index !== -1) {
    keywordLocatedArray.push(index);
    index = str.indexOf(keyword, index+1);
  }

  const arr = str.split('');
  let result = [];

  for (let i = 0; i < arr.length; i++) 
    let min = 101;
    for (let j = 0; j < keywordLocatedArray.length; j++) {
      if (min > Math.abs(i - keywordLocatedArray[j])) {
        min = Math.abs(i - keywordLocatedArray[j]);;
      }
    }
    result.push(min);
  }

  return result.join('');
}
*/

function solution(str, keyword) {
  let result = [];
  let comparisonValue = 1000;

  for (let val of str) {
    if (val === keyword) {
      comparisonValue = 0;
    } else {
      comparisonValue++;
    }
    result.push(comparisonValue);
  }

  comparisonValue = 1000;

  for(let i = (str.length-1); i >= 0; i--) {
    if(str[i] === keyword) {
      comparisonValue = 0;
    } else {
      comparisonValue++;
    }

    result[i] = Math.min(result[i], comparisonValue);
  }

  return result.join('');
}

let str = "teachermode";
console.log(solution(str, "e"));