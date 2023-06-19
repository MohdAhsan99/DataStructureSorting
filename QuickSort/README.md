<h1>Quick Sort</h1>
<p>Quick sort, also known as partition-exchange sort, is an in-place sorting algorithm. It is a divide-and-conquer algorithm that works on the idea of selecting a pivot element and dividing the array into two subarrays around that pivot.</p>
<p>In quick sort, after selecting the pivot element, the array is split into two subarrays. One subarray contains elements smaller than the pivot element, and the other subarray contains elements greater than the pivot element.</p>
<h3>Working of Quicksort Algorithm</h3>
<ol>
  <li><h4>Select the Pivot Element</h4><br/>
    <p>There are different variations of quicksort where the pivot element is selected from different positions. Here, we will be selecting the rightmost element of the array as the pivot element.</p>
  </li>
  <li><h4> Rearrange the Array</h4><br>
    <p>Now the elements of the array are rearranged so that elements that are smaller than the pivot are put on the left and the elements greater than the pivot are put on the right.</p>
       <ul>
         <li>A pointer is fixed at the pivot element. The pivot element is compared with the elements beginning from the first index.</li>
         <li>If the element is greater than the pivot element, a second pointer is set for that element.</li>
          <li>Now, pivot is compared with other elements. If an element smaller than the pivot element is reached, the smaller element is swapped with the greater element found earlier.</li>
          <li>Again, the process is repeated to set the next greater element as the second pointer. And, swap it with another smaller element.</li>
          <li>The process goes on until the second last element is reached.</li>
          <li>Finally, the pivot element is swapped with the second pointer.
         </li> </ul>
  </li>
  <li><h4>Divide Subarrays</h4><br/>
  <p>Pivot elements are again chosen for the left and the right sub-parts separately. And, step 2 is repeated.<br/>
    The subarrays are divided until each subarray is formed of a single element. At this point, the array is already sorted.
  </p>
  </li>
</ol>
