<template>
    <button @click="addCounter">{{ counter }}</button> 
    <!--버튼을 클릭했을 때 어떤 메서드가 동작하게 할 것인지 지정하는 부분 -->

</template>

<script>

export default {
    name: 'global-component',   
    props: ['initialTest'],   //얘랑 a)랑 매핑되어서  counter 동작을 함
    data () {
        return {
            counter: this.initialTest  //a). 여기서 counter가 initialTest라는 prop랑 연결이 되어 있어서  counter를 매핑
                                       //initialTest는 글로벌 컴포넌트의 counter랑 연결이 됨
        }
    },
    methods: {
     //위쪽에 있는 메서드를 연결시켜주는 것이 필요 

        addCounter () {
            this.counter += 1
        }
    }
}

</script>