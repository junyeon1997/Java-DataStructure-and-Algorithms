# Alogorithms_implementing_Java

## 01. 이진탐색(BinarySearch)
* 여러 개의 수가 정렬된 순서로 있을 때 특정한 수를 찾는 방법


* 단순 반복문을 이용하면 수의 개수에 따라 비교 횟수가 증가하는 O(n)의 수행이 이루어짐

 
* 수가 정렬된 상태에서는 이진 탐색(binary search)을 활용하면 매번 비교되는 요소의 수가 절반으로 감소될 수 있으므로 O(logN)의 수행으로 원하는 수를 찾을 수 있음

## 02. 정렬(Sort)

#### 1). 삽입정렬(Insertion Sort)
* Insertion Sort의 기본 개념은 이미 정렬된 상태의 요소에 새로운 요소를 추가할 때 정렬하여 추가하는 개념이다.


* 두 번째 요소 부터 이전 요소들과 비교하면서 insert 될 위치를 찾아가며 정렬하는 알고리즘


* 각 요소가 다른 요소와 평균 한번 이상씩 비교를 하여 정렬하게 되고 최악일 경우 모든 요소들과 비교하여 정렬하기 때문에 시간복잡도는 O(n^2)인 알고리즘  

#### 2). 힙정렬(Heap Sort)
* 힙 정렬은 기본적으로 힙 자료구조를 기반으로 한다.

* '최솟값 또는 최댓값을 빠르게 찾아내기 위해 완전이진트리 형태로 만들어진 자료구조'

* 부모 노드는 자식노드보다 항상 우선순위가 앞선다는 조건만 만족시키며 완전이진트리 형태로 채워나간다.

* 한번 수행될 때마다 정렬되어야 하는 수의 범위가 1/2로 줄어들기 때문에 시간복잡도는 O(logN)인 알고리즘

## 03.Dfs/Bfs
* 그래프 예시



![그래ㅠ프](https://user-images.githubusercontent.com/74363918/122536546-99753d00-d05f-11eb-9444-80b65e3d943c.png)
#### 1). 깊이 우선 탐색(DFS)
* 인접한 노드를 우선 탐색
* 스택을 활용했음
* DFS 탐색 순서 :
0 - 1 - 3 - 7 - 4 - 5 - 2 - 6 or
0 - 2 - 6 - 5 - 4 - 1 - 3 - 7
#### 2). 너비 우선 탐색(BFS)
* 한 노드에 인접한 모든 노드를 탐색 후 이동
* 큐를 활용했음
* BFS 탐색 순서 : 0 - 1 - 2 - 3 - 4 - 5 - 6 - 7