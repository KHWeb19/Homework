<template>
    <form @submit.prevent="onSubmit">
 <h2> 상품 등록 페이지 </h2>
      <table>
          <tr>
              <td>상품명</td>
              <td>
                  <input type="text" v-model="title"/>
              </td>
          </tr>

          <tr>
              <td>판매자</td>
              <td>
                  <input type="text" v-model="seller"/>
              </td>
          </tr>

          <tr>
              <td>상품 상세보기</td>
              <td>
                  <textarea cols="50" rows="20" v-model="content">
                  </textarea>
              </td>
          </tr>
      </table>

        <div>
            <button type="submit">등록</button>
            <router-link :to="{ name: 'MarketListPage' }">
                돌아가기
            </router-link>
            <button type="submit" id="btnList">돌아가기</button>
        </div>
  </form>
</template>

<script>
export default {
    name: 'MarketRegisterForm',
    data () {
        return {
            title: '상품명을 작성하세요.',
            seller: '판매자명',
            content: '본문을 작성하세요'
        }        
    },methods: {
        onSubmit () {
            const { title, seller, content } = this
            this.$emit('submit', { title, seller, content })
        }
    }
}
</script>
