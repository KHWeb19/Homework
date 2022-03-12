<template>
    <ul>
        <li v-for="productItem in products" :key="productItem.pcode"
                v-on:click="sendCode(productItem.pcode, $event)">
          {{ productItem.pname }}
        </li>
    </ul>
</template>

<script>

import EventBus from '@/eventBus.js'

export default {
    data () {
        return {
            products: [
                { pcode: 'p01', pname: '노트북' },
                { pcode: 'p02', pname: '컴퓨터' },
                { pcode: 'p03', pname: '자동차' },
                { pcode: 'p04', pname: '모니터' },
                { pcode: 'p05', pname: '휴대폰' },
                { pcode: 'p06', pname: '마우스' },
                { pcode: 'p07', pname: '키보드' },
                { pcode: 'p08', pname: '태블릿' }
            ]
        }
    },
    methods: {
        sendCode(incode, $event) {
            const payload = [ incode, $event.target.innerHTML ]
            EventBus.$emit('sendCode', payload)
        }
    }
}

</script>