list_test(){
  List<int> nums = [1, 2, 3, 4];

  print(nums[0]);
  print(nums[1]);
  print(nums[2]);
  print(nums[3]);

  return nums;
}

//여기에도 가능하면 reutrn type을 명시해주는 편이 좋긴 하다.
list_add_test(listRef) {
  listRef.add(33);
  listRef.add(77);
}

list_rm_test(listRef) {
  listRef.removeAt(1); //리스트에서 1번을 삭제
}