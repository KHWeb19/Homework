<template>
  <form @submit.prevent="onSubmit"> <!-- onSubmit가 처리하도록 해라  -->
    <table>
      <tr>
        <td>상품명</td>
        <td>
          <input type="text" name="title" v-model="title" />
        </td>
      </tr>
      <tr>
        <td>작성자</td>
        <td>
          <input type="text" name="writer" v-model="writer"/>
        </td>
      </tr>
      <tr>
        <td>가격</td>
        <td>
          <input type="text" name="price" v-model="price"/>
        </td>
      </tr>
      <tr>
        <td>제품 상세 설명</td>
        <td>
          <textarea cols="50" row="20" v-model="description"></textarea>
        </td>
      </tr>
    </table>

    <div>
      <button type="submit">등록</button>
      <router-link :to="{name: 'ProductListPage'}">취소</router-link>
    </div>

  </form>
</template>

<script>
export default {
  name: "ProductRegisterForm",
  data() {
    return{
      title: '상품명',
      writer: '작성자',
      price: '가격',
      description: '상세 설명'
    }
  },
  methods: {
    onSubmit() {
      const {title, writer, price, description} =this

      this.$emit('submit', {title,writer,price,description})
    }

  }
}
</script>

<style scoped>

</style>