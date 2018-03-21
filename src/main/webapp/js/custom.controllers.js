app.controller('AfterLoginController', function($scope) {
 //
});

app.controller('AfterHomeController', function($scope) {
 //
});

app.controller('AfterPageController', function($scope) {
 //
});
//https://ej2.syncfusion.com/16.1.24/angular/demos/#/material/grid/default
// app.directive('cronappGrid', function($compile) {
//   var template = '';
//   return {
//     restrict: 'E',
//     replace: true,
//     scope: {
//       options: '@',
//     },
//     require: 'options',
//     template: '<div></div>',
//     init: function(s) {
//       if (!s.options)
//         s.options = '';
//     },
//     containsLetter: function(value) {
//       var containsLetter;
//       for (var i=0; i<value.length; i++) {
//         containsLetter = true;
//         for (var number = 0; number <10; number++)
//           if (parseInt(value[i]) == number)
//             containsLetter = false;
//         if (containsLetter)
//           break;
//       }
//       return containsLetter;
//     },
//     link: function(scope, element, attr) {
//       this.init(scope);
//       var s = scope;
//       var required = (attr.ngRequired && attr.ngRequired == "true"?"required":"");
//       var templateDyn    = '<div class="form-group upload-image-component" ngf-drop="" ngf-drag-over-class="dragover">\
//                             <img class="$class$" style="$style$; height: $height$; width: $width$;" ng-if="$ngModel$" data-ng-src="{{$ngModel$.startsWith(\'http\') || ($ngModel$.startsWith(\'/\') && $ngModel$.length < 1000)? $ngModel$ : \'data:image/png;base64,\' + $ngModel$}}">\
//                             <img class="$class$" style="$style$; height: $height$; width: $width$;" ng-if="!$ngModel$" data-ng-src="/plugins/cronapp-framework-js/img/selectImg.svg" class="btn" ng-if="!$ngModel$" ngf-drop="" ngf-select="" ngf-change="cronapi.internal.setFile(\'$ngModel$\', $file)" accept="image/*;capture=camera">\
//                             <div class="remove btn btn-danger btn-xs" ng-if="$ngModel$" ng-click="$ngModel$=null">\
//                               <span class="glyphicon glyphicon-remove"></span>\
//                             </div>\
//                             <div class="btn btn-info btn-xs start-camera-button" ng-if="!$ngModel$" ng-click="cronapi.internal.startCamera(\'$ngModel$\')">\
//                               <span class="glyphicon glyphicon-facetime-video"></span>\
//                             </div>\
//                             <input ng-if="!$ngModel$" autocomplete="off" tabindex="-1" class="uiSelectRequired ui-select-offscreen" style="top: inherit !important; margin-left: 85px !important;margin-top: 50px !important;" type=text ng-model="$ngModel$" $required$>\
//                           </div>';
//       element.append(templateDyn
//           // .split('$height$').join(s.height)
//           // .split('$width$').join(s.width)
//           .split('$ngModel$').join(s.options)
//           // .split('$style$').join(s.style)
//           // .split('$class$').join(s.class)
//           // .split('$required$').join(required)
//       );


//       $compile(element)(element.scope());
//     }
//   }
// });