/*
지도 정보가 N*N 격자판에 주어집니다. 각 격자에는 그 지역의 높이가 쓰여있습니다. 각 격자 판의 숫자 중 자신의 상하좌우 숫자보다 큰 숫자는 봉우리 지역입니다. 
봉우리 지역이 몇 개 있는 지 알아내는 프로그램을 작성하세요.
격자의 가장자리는 0으로 초기화 되었다고 가정한다.
만약 N=5 이고, 격자판의 숫자가 다음과 같다면 봉우리의 개수는 10개입니다.

▣ 입력설명
첫 줄에 자연수 N이 주어진다.(1<=N<=50)
두 번째 줄부터 N줄에 걸쳐 각 줄에 N개의 자연수가 주어진다. 각 자연수는 100을 넘지 않는 다.
▣ 출력설명
봉우리의 개수를 출력하세요.
▣ 입력예제 1 
  5
  53723 37161 72534 43641 87352
▣ 출력예제 1 
  10
*/

function solution(arr) {
  let execArr = Array.from(arr);

  for (let i = 0; i < arr.length; i++) {
    execArr[i].unshift(0);
    execArr[i].push(0);
  }

  execArr.unshift(Array.from({length: arr.length+2}, (value) => value = 0 ));
  execArr.push(Array.from({length: arr.length+2}, (value) => value = 0 ));

  let countArr = Array.from({length: execArr.length}, () => Array(execArr.length).fill(false));

  for (let i = 1; i < arr.length+1; i++) {
    
    for (let j = 1; j < arr.length+1; j++) {
      const comparisonArr = [0, execArr[i-1][j], 0, execArr[i][j-1], execArr[i][j], execArr[i][j+1], 0, execArr[i+1][j], 0]; 
      const max = Math.max(...comparisonArr);

      let idx = comparisonArr.indexOf(max);
      while(idx !== -1) {
        // console.log("i idx:",Math.floor(idx/3) + i - 1,"j idx:", getIdx(idx) + j - 1, "value:", max);
        countArr[i + Math.floor(idx/3) - 1][j + getIdx(idx) - 1] = true;
        idx = comparisonArr.indexOf(max, idx+1);
      }
      
    }
  }

  let count = 0;

  countArr.forEach((arr) => {
    arr.forEach((item) => {
      if (item === true) count++;
    })
  })

  // console.log(countArr);
  
  return count;
}

function getIdx(idx) {
  while(idx > 2) {
    idx -= 3;
  }

  return idx;
}

let arr=[[5, 3, 7, 2, 3], 
          [3, 7, 1, 6, 1],
          [7, 2, 5, 3, 4],
          [4, 3, 6, 4, 1],
          [8, 7, 3, 5, 2]];
console.log(solution(arr));