import Vue from 'vue'
const EventBus = new Vue() //이벤트버스 생성
export default EventBus

//이벤트버스가 뷰객체에 생성되어 있다면
//EventBus.$emit과 EventBus.$on을 사용해서 어떤 Component에서 쓸 지 표시하는 거겠지?