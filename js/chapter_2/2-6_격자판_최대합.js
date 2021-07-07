/*
N*N의 격자판이 주어지면 각 행의 합, 각 열의 합, 두 대각선의 합 중 가 장 큰 합을 출력합 니다.
▣ 입력설명
첫 줄에 자연수 N이 주어진다.(1<=N<=50)
두 번째 줄부터 N줄에 걸쳐 각 줄에 N개의 자연수가 주어진다. 각 자연수는 100을 넘지 않는 다.
▣ 출력설명 최대합을 출력합니다.
▣ 입력예제 1
  5
  10 13 10 12 15 12 39 30 23 11 11 25 50 53 15 19 27 29 37 27 19 13 30 13 19
▣ 출력예제 1 
  155
*/

function solution(arr) {
  let row = Array.from({length: arr.length}, () => 0);
  let column = Array.from({length: arr.length}, () => 0);
  let diagonal = [0, 0];

  // 반대 대각선 구하는 기준
  let standard = arr.length -1;

  for(let i = 0; i < arr.length; i++) {

    for(let j = 0; j < arr.length; j++) {
      row[i] += arr[i][j];
      column[i] += arr[j][i];

      if(i === j) {
        diagonal[0] += arr[i][j];
      }

      if(standard === j) {
        diagonal[1] += arr[i][j];
        standard--;
      }
    }
  }

  return Math.max(Math.max(...row), Math.max(...column), Math.max(...diagonal))
}

let arr=[[10, 13, 10, 12, 15], 
        [12, 39, 30, 23, 11],
        [11, 25, 50, 53, 15],
        [19, 27, 29, 37, 27],
        [19, 13, 30, 13, 19]];
console.log(solution(arr));